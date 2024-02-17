package classdemo.ch9.Collection;

import java.util.HashSet;

//用record類別將特定資料以物件形式存取 因其具不可變動 欄位名稱 順序等特性 因此編譯器可自動生成如前面所建的hashcode equals方法 十分便捷
record Student3(String name, String number) {}

public class Students3 {
    public static void main(String[] args) {
        var students = new HashSet();
        students.add(new Student3("Justin", "B835031"));
        students.add(new Student3("Monica", "B835032"));
        students.add(new Student3("Justin", "B835031"));
        System.out.println(students);
    }
}
