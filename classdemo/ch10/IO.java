package classdemo.ch10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
    public static void dump(InputStream src, OutputStream dest)
            throws IOException {
        //dump() 方法接受in out putStream 有相關錯誤時 其會拋出異常
            var data = new byte[1024];
            var length = 0;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }

