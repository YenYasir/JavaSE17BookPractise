package chapterexercise.ch6;

import java.util.Arrays;

public class Ex1 {
    private Object[] elems;
    private int next;

    public Ex1() {
        this(16);
    }

    public Ex1(int capacity) {
        elems = new Object[capacity];
    }

    public void add(Object o) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = o;
    }

    public Object get(int index) {
        return elems[index];
    }

    public int size() {
        return next;
    }

    @Override
    public String toString() {
        var desc = new StringBuilder();
        desc.append("ArrayList{");
        var last = next - 1;
        for(var i = 0; i < last; i++) {
            desc.append(elems[i]).append(", ");
        }
        desc.append(elems[last]).append("}");
        return desc.toString();
    }
}
