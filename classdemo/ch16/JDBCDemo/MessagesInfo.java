package classdemo.ch16.JDBCDemo;

import java.sql.*;
import java.util.*;
import javax.sql.DataSource;

public class MessagesInfo {
    private DataSource dataSource;

    public MessagesInfo(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<ColumnInfo> getAllColumnInfo() {
        List<ColumnInfo> infos = null;
        try(var conn = dataSource.getConnection()) {
            var meta = conn.getMetaData();
            //查詢MESSAGES所有欄位
            var crs = meta.getColumns(null, null, "MESSAGES", null);
            //收集欄位資訊
            infos =  new ArrayList<>();
            while(crs.next()) {
                //封裝欄位名稱 大小
                ColumnInfo info = toColumnInfo(crs);
                infos.add(info);
            }
        }
        catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return infos;
    }

    private ColumnInfo toColumnInfo(ResultSet crs) throws SQLException {
        return new ColumnInfo(
                crs.getString("COLUMN_NAME"),
                crs.getString("TYPE_NAME"),
                crs.getInt("COLUMN_SIZE"),
                crs.getBoolean("IS_NULLABLE"),
                crs.getString("COLUMN_DEF")
        );
    }
}