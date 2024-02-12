package chapterexercise.ch5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入盤數：");
        int disks = scanner.nextInt();
        moveDisks(disks, 'A', 'B', 'C');
    }

    public static void moveDisks(int disks, char source, char auxiliary, char destination) {
        if (disks == 1) {
            System.out.println("將盤子從 " + source + " 移至 " + destination);
        } else {
            moveDisks(disks - 1, source, destination, auxiliary);
            System.out.println("將盤子從 " + source + " 移至 " + destination);
            moveDisks(disks - 1, auxiliary, source, destination);
        }
    }
}
