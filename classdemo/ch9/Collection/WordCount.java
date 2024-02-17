package classdemo.ch9.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) {
        var console = new Scanner(System.in);

        System.out.print("請輸入英文：");
        var words = tokenSet(console.nextLine());
        //顯示收集的個數與字串
        System.out.printf("不重複單字有 %d 個：%s%n", words.size(), words);
    }

    static Set tokenSet(String line) {
        //根據空白切割字串
        var tokens = line.split(" ");
        return new HashSet(Arrays.asList(tokens));
    }
}
