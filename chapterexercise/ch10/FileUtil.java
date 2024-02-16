package chapterexercise.ch10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.function.Consumer;

public class FileUtil {
    public static void open(String filename, Consumer<InputStream> consumer) {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            consumer.accept(fileInputStream);
        } catch (IOException e) {
            throw new UncheckedIOException("打開檔案時報錯:  " + filename, e);
        }
    }


}
