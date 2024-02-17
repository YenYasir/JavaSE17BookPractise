package classdemo.ch8.TryCatch;

public class StackTraceDemo2 {
    public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    static void c() {
        try {
            b();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
            //使用throw 重拋例外時 例外的堆疊起點仍是發生的根源 而不是重拋的地方
            //想讓例外的堆疊起點是重拋的地方 可用fillInStackTrace()
            throw ex;
        }

    }

    static void b() {
        a();
    }

    static String a() {
        String text = null;
        return text.toUpperCase();
    }
}
