package classdemo.ch8.TryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtilByTryWith {
    public static String readFile(String name) throws FileNotFoundException {
        var text = new StringBuilder();
        try(var console = new Scanner(new FileInputStream(name))) {
            while(console.hasNext()) {
                text.append(console.nextLine())
                        .append('\n');
            }
        }
        return text.toString();
    }
}
