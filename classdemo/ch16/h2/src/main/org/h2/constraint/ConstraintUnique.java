/*
 * Copyright 2004-2023 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.constraint;

import java.util.ArrayList;
import java.util.HashSet;
import org.h2.engine.SessionLocal;
import org.h2.engine.NullsDistinct;
import org.h2.index.Index;
import org.h2.result.Row;
import org.h2.schema.Schema;
import org.h2.table.Column;
import org.h2.table.IndexColumn;
import org.h2.table.Table;
import org.h2.util.StringUtils;

/**
 * A unique constraint. This object always backed by a unique index.
 */
public class ConstraintUnique extends Constraint {

    private Index index;
    private boolean indexOwner;
    private IndexColumn[] columns;
    private final boolean primaryKey;
    private NullsDistinct nullsDistinct;

    public ConstraintUnique(Schema schema, int id, String name, Table table, boolean primaryKey,
            NullsDistinct nullsDistinct) {
        super(schema, id, name, table);
        this.primaryKey = primaryKey;
        this.nullsDistinct = nullsDistinct;
    }

    @Override
    public Type getConstraintType() {
        return primaryKey ? Constraint.Type.PRIMARY_KEY : Constraint.Type.UNIQUE;
    }

    @Override
    public String getCreateSQLForCopy(Table forTable, String quotedName) {
        return getCreateSQLForCopy(forTable, quotedName, true);
    }

    private String getCreateSQLForCopy(Table forTable, String quotedName, boolean internalIndex) {
        StringBuilder builder = new StringBuilder("ALTER TABLE ");
        forTable.getSQL(builder, DEFAULT_SQL_FLAGS).append(" ADD CONSTRAINT ");
        if (forTable.isHidden()) {
            builder.append("IF NOT EXISTS ");
        }
        builder.append(quotedName);
        if (comment != null) {
            builder.append(" COMMENT ");
            StringUtils.quoteStringSQL(builder, comment);
        }
        builder.append(' ').append(getConstraintType().getSqlName()).append('(');
        IndexColumn.writeColumns(builder, columns, DEFAULT_SQL_FLAGS).append(')');
        if (internalIndex && indexOwner && forTable == this.table) {
            builder.append(" INDEX ");
            index.getSQL(builder, DEFAULT_SQL_FLAGS);
        }
        return builder.toString();
    }

    @Override
    public String getCreateSQLWithoutIndexes() {
        return getCreateSQLForCopy(table, getSQL(DEFAULT_SQL_FLAGS), false);
    }

    @Override
    public String getCreateSQL() {
        return getCreateSQLForCopy(table, getSQL(DEFAULT_SQL_FLAGS));
    }

    public void setColumns(IndexColumn[] columns) {
        this.columns = columns;
    }

    public IndexColumn[] getColumns() {
        return columns;
    }

    /**
     * Set the index to use for this unique constraint.
     *
     * @param index the index
     * @param isOwner true if the index is generated by the system and belongs
     *            to this constraint
     */
    public void setIndex(Index index, boolean isOwner) {
        this.index = index;
        this.indexOwner = isOwner;
    }

    @Override
    public void removeChildrenAndResources(SessionLocal session) {
        ArrayList<Constraint> constraints = table.getConstraints();
        if (constraints != null) {
            constraints = new ArrayList<>(table.getConstraints());
            for (Constraint c : constraints) {
                if (c.getReferencedConstraint() == this) {
                    database.removeSchemaObject(session, c);
                }
            }
        }
        table.removeConstraint(this);
        if (indexOwner) {
            table.removeIndexOrTransferOwnership(session, index);
        }
        database.removeMeta(session, getId());
        index = null;
        columns = null;
        table = null;
        invalidate();
    }

    @Override
    public void checkRow(SessionLocal session, Table t, Row oldRow, Row newRow) {
        // unique index check is enough
    }

    @Override
    public boolean usesIndex(Index idx) {
        return idx == index;
    }

    @Override
    public void setIndexOwner(Index index) {
        indexOwner = true;
    }

    @Override
    public HashSet<Column> getReferencedColumns(Table table) {
        HashSet<Column> result = new HashSet<>();
        for (IndexColumn c : columns) {
            result.add(c.column);
        }
        return result;
    }

    @Override
    public boolean isBefore() {
        return true;
    }

    @Override
    public void checkExistingData(SessionLocal session) {
        // no need to check: when creating the unique index any problems are
        // found
    }

    @Override
    public Index getIndex() {
        return index;
    }

    @Override
    public void rebuild() {
        // nothing to do
    }

    /**
     * @return are nulls distinct
     */
    public NullsDistinct getNullsDistinct() {
        return nullsDistinct;
    }

}
