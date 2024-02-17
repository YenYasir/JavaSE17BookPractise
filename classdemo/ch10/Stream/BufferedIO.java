package classdemo.ch10.Stream;

import java.io.*;

public class BufferedIO {
    public static void dump(InputStream src, OutputStream dest)
            throws IOException {
        //於內部提供緩衝區
        try(var input = new BufferedInputStream(src);
            var output = new BufferedOutputStream(dest)) {
            var data = new byte[1024];
            var length = 0;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}