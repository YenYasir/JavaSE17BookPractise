package classdemo.ch6.Game;

public class RPG2 {
    public static void main(String[] args) {
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);

        showBlood(swordsMan);
        showBlood(magician);


        drawFight(swordsMan);
        drawFight(magician);
    }

    static void showBlood(Role role) {
        System.out.printf("%s 血量 %d%n",
                role.getName(), role.getBlood());
    }

    static void drawFight(Role role) {
        System.out.print(role.getName());
        role.fight();
    }
}
