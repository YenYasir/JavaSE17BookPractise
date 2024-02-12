package chapterexercise.ch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<String> cards = new ArrayList<>();
        String[] suits = {"桃", "心", "磚", "梅"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        StringBuilder sb = new StringBuilder();
        for (String suit : suits) {
            for (String rank : ranks) {
                sb.setLength(0);
                sb.append(suit).append(rank);
                cards.add(sb.toString());
            }
        }

        // 洗牌
        Collections.shuffle(cards);

        // 排序
        Collections.sort(cards);

        // 列印排序後的撲克牌
        System.out.println("排序後的撲克牌：");
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i) + " ");
            if ((i + 1) % 13 == 0) {
                System.out.println();//換行
            }
        }
    }
}
