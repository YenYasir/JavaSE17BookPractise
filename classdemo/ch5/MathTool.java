package classdemo.ch5;

public class MathTool {
    //int... 不定長度引數
    public static int sum(int... numbers) {
        var sum = 0;
        for(var number : numbers) {
            sum += number;
        }
        return sum;
    }
}
