package chapterexercise.ch9;

import java.util.Iterator;

public class IterableString implements Iterable<Character> {
    private String str;

    public IterableString(String str) {
        this.str = str;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringIterator();
    }

    private class StringIterator implements Iterator<Character> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < str.length();
        }

        @Override
        public Character next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException();
            }
            return str.charAt(index++);
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}