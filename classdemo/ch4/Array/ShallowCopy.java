package classdemo.ch4.Array;


class Clothes3 {
    String color;
    char size;
    Clothes3(String color, char size) {
        this.color = color;
        this.size = size;
    }
}
//淺層複製
public class ShallowCopy {
    public static void main(String[] args) {
        Clothes3[] c1 = {new Clothes3("red", 'L'), new Clothes3("blue", 'M')};
        var c2 = new Clothes3[c1.length];
        //迴圈中僅將c1每個索引處參考的物件也給c2每個物件作參考 並未複製Clothes物件 稱複製參考
        for (var i = 0; i < c1.length; i++) {
            c2[i] = c1[i];
        }

        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}
