package classdemo.ch6.Game;


import java.util.Scanner;

public class ConsoleGame  extends  GuessGame{

    private Scanner console = new Scanner(System.in);

    @Override
    public void print(String text) {
        System.out.print(text);

    }

    @Override
    public int nextInt() {
        return console.nextInt();
    }

}
