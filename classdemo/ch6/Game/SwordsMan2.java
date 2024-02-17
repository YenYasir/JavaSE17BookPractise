package classdemo.ch6.Game;

public class SwordsMan2 extends RoleAbstract{
    @Override
    public void fight() {
        System.out.println("揮劍攻擊");
    }

//    public String toString() {
//        return "劍士 (%s, %d, %d)".formatted(
//                this.name, this.level, this.blood);
//    }

    @Override
    public String toString() {
        //super 取得父類別的方法定義
        return "劍士 " + super.toString();
    }
}
