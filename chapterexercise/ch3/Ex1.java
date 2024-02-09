package chapterexercise.ch3;

public class Ex1 {


    public static int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            // 假設a 較大，不斷地將 a 除以 b，得到的餘數作為新的 b，原來的 b 變成新的 a。
            //重複步驟直到 b 為 0。當 b 為 0 時，則 a 即為最大公因數。
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        var m = 1000;
        var n = 495;

        int result = gcd(m, n);
        System.out.println("最大公因數為: " + result);
    }
}
