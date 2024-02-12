package chapterexercise.ch4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("請輸入欲計算的費波那契數列個數：");
        int count = scanner.nextInt();

        // 列印費波那契數列
        System.out.println("費波那契數列前 " + count + " 個數為：");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }


    }

    // 計算方法
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}