package classdemo.ch9.Collection;

import java.util.*;
import static java.util.Comparator.*;

public class Sort4 {
    public static void main(String[] args) {
        var words = Arrays.asList(
                "B", "X", "A", "M", null ,"F", "W", "O", null);
        //reverseOrder會反轉comparable物件定義的排序 nullsFirst使排序附上null加在最前頭的規則
        words.sort(nullsFirst(reverseOrder()));
        System.out.println(words);
    }
}