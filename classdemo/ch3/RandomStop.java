package classdemo.ch3;

public class RandomStop {
    public static void main(String[] args) {
        while(true) {//直接執行
            var number = (int) (Math.random() * 10);
            System.out.println(number);
            
            if(number == 5) {
                System.out.println("I hit 5....Orz");
                break;
            }
        }
    }
}
