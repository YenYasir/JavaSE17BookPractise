package classdemo.ch16.JDBCDemo;

public record ColumnInfo(
        String name,
        String type,
        int size,
        boolean nullable,
        String def) {}