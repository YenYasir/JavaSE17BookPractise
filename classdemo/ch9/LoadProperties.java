package classdemo.ch9;

import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) throws IOException {
        var props = new Properties();
        //setProperty getProperty相當常用  props.load常用於實作FileInputStream實例
        props.setProperty("username", "Justin");
        props.setProperty("password", "7777");
//        props.load(new FileInputStream(args[0]));
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
