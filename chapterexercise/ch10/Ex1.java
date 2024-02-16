package chapterexercise.ch10;

import java.io.*;

public class Ex1 {
    public static void dump(InputStream src, OutputStream dest) throws IOException {
        try (src; dest) {
            var data = new byte[1024];
            var length = 0;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        } catch (IOException ex) {
            try (var writer = new PrintWriter(
                    //用OutputStreamWriter包裹住FileOutputStream 並將位元組資料轉換為對應的編碼字元 (UTF8
                    new OutputStreamWriter(
                            new FileOutputStream("exception.log", true), "UTF-8"))) {
                ex.printStackTrace(writer);
            }
            throw ex;
        }
    }
}
