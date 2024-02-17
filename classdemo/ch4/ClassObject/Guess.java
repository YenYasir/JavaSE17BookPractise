package classdemo.ch4.ClassObject;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        var console = new Scanner(System.in);
        var number = (int) (Math.random() * 10);
        var guess = -1;
        
        do {
            System.out.print("猜數字(0 ~ 9):");
            guess = console.nextInt();
        } while(guess != number);
        
        System.out.println("猜中了...XD");
    }
}
