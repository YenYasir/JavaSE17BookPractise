package classdemo.ch16.JDBCDemo;

import static java.lang.System.out;
import java.util.Scanner;

public class MessageDAODemo {
    public static void main(String[] args) throws  Exception {
        var url = "jdbc:h2:tcp://localhost/C:/JAVA_CODE/JavaProject/JavaSE17Practise/classdemo/ch16/JDBCDemo";
        var username = "YenYasir";
        var password = "dd60605";

        var dao = new MessageDAO(url, username, password);
        var console = new Scanner(System.in);

        while(true) {
            out.print("(輸1) 顯示留言 (輸2) 新增留言：");
            switch(Integer.parseInt(console.nextLine())) {
                case 1:
                    dao.get().forEach(message -> {
                        out.printf("%s\t%s\t%s%n",
                                message.name(),
                                message.email(),
                                message.msg());
                    });
                    break;
                case 2:
                    out.print("姓名：");
                    var name = console.nextLine();
                    out.print("郵件：");
                    var email = console.nextLine();
                    out.print("留言：");
                    var msg = console.nextLine();
                    dao.add(new Message(name, email, msg));
            }
        }
    }

}

