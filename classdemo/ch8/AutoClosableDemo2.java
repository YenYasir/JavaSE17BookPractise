package classdemo.ch8;

import static java.lang.System.*;

public class AutoClosableDemo2 {
    public static void main(String[] args) {
        //try括號中 越後面撰寫的物件會越先關閉
        try(var some = new ResourceSome();
            var other = new ResourceOther()) {
            some.doSome();
            other.doOther();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ResourceSome implements AutoCloseable {
    void doSome() {
        out.println("做一些事");
    }

    @Override
    public void close() throws Exception {
        out.println("資源Some被關閉");
    }
}

class ResourceOther implements AutoCloseable {
    void doOther() {
        out.println("做其它事");
    }

    @Override
    public void close() throws Exception {
        out.println("資源Other被關閉");
    }
}
