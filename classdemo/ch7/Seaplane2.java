package classdemo.ch7;

public class Seaplane2 extends Airplane implements Swimmer {
    public Seaplane2(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.print("海上");
        super.fly();
    }

    @Override
    public void swim() {
        System.out.printf("海上飛機 %s 航行海面%n", name);
    }
}
