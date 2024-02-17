package classdemo.ch10.Stream;

import java.io.*;

public class CharUtil {
    //InputStream OutputStream讀取位元資料 如果要得讀取字元資料 用Reader Writer
    public static void dump(Reader src, Writer dest) throws IOException {
        try(src; dest) {
            var data = new char[1024];
            var length = 0;
            //read()讀取資料 非-1就表示讀取的到
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}