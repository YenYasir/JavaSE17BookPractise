package chapterexercise.ch10;

import java.io.IOException;

public interface Consumer<T> {
    void accept(T t) throws IOException;
}
