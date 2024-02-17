package classdemo.ch7.OceanWorld;

public class Submarine2 extends Boat implements Diver {
    public Submarine2(String name) {
        super(name);
    }

    @Override
    public void dive() {
        System.out.printf("潛水艇 %s 潛行%n", name);
    }
}
