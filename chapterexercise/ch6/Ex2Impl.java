package chapterexercise.ch6;


import java.util.Date;

public class Ex2Impl {
    public static void main(String[] args) {
        var d1 = new Date();
        var d2 = new Date();
        var d3 = new Date();
        var list1 = new Ex2();
        list1.add(d1);
        list1.add(d2);
        list1.add(d3);

        var list2 = new Ex2();
        list2.add(d1);
        list2.add(d2);
        list2.add(d3);
        System.out.println(list1.equals(list2));

        list2.add(new Date());
        System.out.println(list1.equals(list2));
    }
}
