package classdemo.ch4.Array;

class Clothes4 {
    String color;
    char size;
    Clothes4(String color, char size) {
        this.color = color;
        this.size = size;
    }
}
//深層複製
public class DeepCopy {
    public static void main(String[] args) {
        Clothes4[] c1 = {new Clothes4("red", 'L'), new Clothes4("blue", 'M')};
        var c2 = new Clothes4[c1.length];
        //c1個索引參考物件會被複製 分別指定給c2個索引位置
        for(var i = 0; i < c1.length; i++) {
            c2[i] = new Clothes4(c1[i].color, c1[i].size);
        }

        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}