package chapterexercise.ch4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 31, 33, 37, 48, 60, 70, 80, 80};


        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要尋找的數字：");
        int target = scanner.nextInt();

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("索引值為 " + index);
        } else {
            System.out.println("-1");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // 找到目標，返回索引值
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // 未找到目標，返回 -1
    }
}
