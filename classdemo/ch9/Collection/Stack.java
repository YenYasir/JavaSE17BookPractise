package classdemo.ch9.Collection;


import java.util.*;
import static java.lang.System.out;

public class Stack {
    private Deque elems = new ArrayDeque();
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean push(Object elem) {
        if(isFull()) {
            return false;
        }
        return elems.offerLast(elem);
    }

    private boolean isFull() {
        return elems.size() + 1 > capacity;
    }
    //改由後端取物件
    public Object pop() {
        return elems.pollLast();
    }

    public Object peek() {
        return elems.peekLast();
    }

    public int size() {
        return elems.size();
    }
    //改為先進後出 Justin最後
    public static void main(String[] args) {
        var stack = new Stack(5);
        stack.push("Justin");
        stack.push("Monica");
        stack.push("Irene");
        out.println(stack.pop());
        out.println(stack.pop());
        out.println(stack.pop());
    }
}