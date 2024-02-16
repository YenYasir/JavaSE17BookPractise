package classdemo.ch9;

import java.util.TreeMap;

public class Messages2 {
    public static void main(String[] args) {
        var messages = new TreeMap<String, String>();
        messages.put("Justin", "Hello！Justin的訊息！");
        messages.put("Monica", "給Monica的悄悄話！");
        messages.put("Irene", "Irene的可愛貓喵喵叫！");
        //根據鍵值來排序 (因為string採comparable
        System.out.println(messages);
    }
}