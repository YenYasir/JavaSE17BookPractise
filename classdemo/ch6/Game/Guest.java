package classdemo.ch6.Game;

import java.util.Scanner;
import static java.lang.System.out;

public class Guest {
    public static void main(String[] args) {
        var names = new ArrayList();
        collectNameTo(names);
        out.println("訪客名單：");
        printUpperCase(names);
    }

    static void collectNameTo(ArrayList names) {
        var userInput = new Scanner(System.in);
        while(true) {
            out.print("訪客名稱：");
            var name = userInput.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    static void printUpperCase(ArrayList names) {
        for(var i = 0; i < names.size(); i++) {
            var name = (String) names.get(i);
            out.println(name.toUpperCase());
        }
    }
}
