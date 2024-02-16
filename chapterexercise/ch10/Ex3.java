package chapterexercise.ch10;

import java.util.Scanner;

import static chapterexercise.ch10.FileUtil.open;

public class Ex3 {
    public static void main(String[] args) {
        open(args[0], fileInputStream -> {
            var file = new Scanner(fileInputStream);
            while(file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        });
    }
}
