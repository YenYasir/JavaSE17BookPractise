package classdemo.ch5.Class;


class Other {
    {
        System.out.println("物件初始區塊");
    }

    Other() {
        System.out.println("Other() 建構式");
    }

    Other(int o) {
        this();
        System.out.println("Other(int o) 建構式");
    }
}
//此範例，呼叫了Other(int o) 建構式，其中this()呼叫了Other() 建構式，如果有撰寫物件初始區塊，物件建立後會先執行初始區塊
public class ObjectInitialBlock {
    public static void main(String[] args) {
        new Other(1);
    }
}
