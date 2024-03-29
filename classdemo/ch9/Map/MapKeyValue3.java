package classdemo.ch9.Map;

import java.util.*;

public class MapKeyValue3 {
    public static void main(String[] args) {
        var map = new TreeMap<String, String>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        //結果同2 更具可讀性
        map.forEach(
                (key, value) -> System.out.printf("(鍵 %s, 值 %s)%n", key, value)
        );
    }
}