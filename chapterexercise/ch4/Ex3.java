package chapterexercise.ch4;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] number = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};

        //Arrays.sort : Java 內置的排序方法
        Arrays.sort(number);

        // 列印排序後的陣列
        System.out.println("排序後的陣列：");
        for (int i : number) {
            System.out.print(i + " ");
        }
    }
}
