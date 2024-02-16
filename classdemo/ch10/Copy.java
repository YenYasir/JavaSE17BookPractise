package classdemo.ch10;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        IO.dump(
                //讀入檔案並另存新檔
                new FileInputStream(args[0]),
                new FileOutputStream(args[1])
        );
    }
}