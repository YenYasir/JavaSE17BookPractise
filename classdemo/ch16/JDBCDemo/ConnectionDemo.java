package classdemo.ch16.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.System.out;

public class ConnectionDemo {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        var url = "jdbc:h2:tcp://localhost/C:/JAVA_CODE/JavaProject/JavaSE17Practise/classdemo/ch16/JDBCDemo";
        var user = "YenYasir";
        var password = "dd60605";

        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            out.printf("已%s資料庫連線%n",
                    conn.isClosed() ? "關閉" : "開啟");
        }
    }
}
