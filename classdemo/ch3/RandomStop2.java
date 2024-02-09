package classdemo.ch3;

public class RandomStop2 {
    public static void main(String[] args) {
        var number = -1;
        // 初始化為 -1 保證程式至少會執行一次 do-while 迴圈
        
        do {
            number = (int) (Math.random() * 10);
            System.out.println(number);
        } while(number != 5);
        System.out.println("I hit 5....Orz");
    }
}
