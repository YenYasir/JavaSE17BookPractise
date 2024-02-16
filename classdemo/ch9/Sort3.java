package classdemo.ch9;


import java.util.*;

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        //string本身就是comparable 傳回值乘上-1可使其排序倒轉
        return -s1.compareTo(s2);
    }
}

public class Sort3 {
    public static void main(String[] args) {
        var words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
        Collections.sort(words, new StringComparator());
        System.out.println(words);
    }
}