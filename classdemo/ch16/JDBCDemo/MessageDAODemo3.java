package classdemo.ch16.JDBCDemo;

import java.util.Scanner;
import static java.lang.System.*;

public class MessageDAODemo3 {
    public static void main(String[] args) throws Exception {
        var dao = new MessageDAO3(new SimpleConnectionPoolDataSource());

        var console = new Scanner(System.in);
        while(true) {
            out.print("(1) 顯示留言 (2) 新增留言：");
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
