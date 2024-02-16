package chapterexercise.ch9;

import java.util.Deque;
import java.util.LinkedList;

public class Ex2 {
    public static void main(String[] args) {
        String[] words = {"RADAR","WARTER START","MILK KLIM","RESERVERED","IWI"};
        for(var word : words) {
            if(isReversedWord(word)) {
                System.out.println(word);
            }
        }
    }
    //建立兩個char 分別正序 倒序 並比對是否相等
    private static boolean isReversedWord(String word) {
        var characterDeque = toDeque(word.toCharArray());
        Character c1, c2;
        while((c1 = characterDeque.pollFirst()) != null && (c2 = characterDeque.pollLast()) != null) {
            if(!c1.equals(c2)) {
                return false;
            }
        }
        return true;
    }
    //建立deque實例
    private static Deque<Character> toDeque(char[] cs) {
        var deque = new LinkedList<Character>();
        for(var c : cs) {
            deque.offer(c);
        }
        return deque;
    }
}
