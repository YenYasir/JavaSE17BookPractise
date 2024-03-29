package classdemo.ch10.Stream;

import static java.lang.System.out;

public class Member2Demo {
    public static void main(String[] args) throws Exception {
        Member2[] members = {
                new Member2("B1234", "Justin", 90),
                new Member2("B5678", "Monica", 95),
                new Member2("B9876", "Irene", 88)};
        for(var member : members) {
            member.save();
        }
        out.println(Member2.load("B1234"));
        out.println(Member2.load("B5678"));
        out.println(Member2.load("B9876"));
        //某些資料成員如果不希望序列化時不被寫入 可以加上transient
    }
}