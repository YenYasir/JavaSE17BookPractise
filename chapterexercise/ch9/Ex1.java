package chapterexercise.ch9;

public class Ex1 {
    public static void main(String[] args) {
        for(var c : new IterableString("YYK")) {
            System.out.println(c);
        }

        new IterableString("Yasir").forEach(c -> System.out.println(c));
    }
}
