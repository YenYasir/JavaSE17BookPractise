package classdemo.ch7.OceanWorld;

public class SwimPlayer extends HumanNoSwim implements Swimmer {
    public SwimPlayer(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("游泳選手 %s 游泳%n", name);
    }
}
