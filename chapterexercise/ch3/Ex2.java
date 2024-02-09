package chapterexercise.ch3;

public class Ex2 {
    //Armstrong指一個n位數的數字，其各個位數的n次方的總和等於該數本身
    public static boolean isArmstrong(int num){
        int originalNum = num;
        //幾位數
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            //要乘多少次方
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        System.out.println("所有三位數的阿姆斯壯數：");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
