package classdemo.ch6;

public class Role {

    public void fight() {
        // 子類別要重新定義fight()的實際行為
    }
    private String name;
    private int level;
    private int blood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
