package classdemo.ch3;

public class Range{
    public static void main(String[] args) {
        //byte short int long 's range

        // %d 10進位整數格式輸出 %n 換行符號
        System.out.printf("%d~%d%n",Byte.MIN_VALUE,Byte.MAX_VALUE);
        System.out.printf("%d~%d%n",Short.MIN_VALUE,Short.MAX_VALUE);
        System.out.printf("%d~%d%n",Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("%d~%d%n",Long.MIN_VALUE,Long.MAX_VALUE);

        System.out.printf("%d~%d%n",Float.MIN_EXPONENT,Float.MAX_EXPONENT);
        System.out.printf("%d~%d%n",Double.MIN_EXPONENT,Double.MAX_EXPONENT);
        // %h 使用Integer.toHexString(arg.hashCode())來得到輸出 也常用於16進位格式
        System.out.printf("%h~%h%n",Character.MIN_VALUE,Character.MAX_VALUE);
        //%b 輸出布林值
        System.out.printf("%b~%b%n",Boolean.TRUE,Boolean.FALSE);

    }
}