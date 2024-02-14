package chapterexercise.ch7;


import java.util.*;

interface Playable {
    void play();
}
//採用composite pattern可以拆開影格 圖片等素材 來設計 以達到自由加減播放清單內容
class Frame implements Playable {
    private String image;
    Frame(String image) {
        this.image = image;
    }
    public void play() {
        System.out.println("播放 " + image);
    }
}

class Playlist implements Playable {
    private List playList = new ArrayList();
    public Playlist add(Playable playable) {
        playList.add(playable);
        return this;
    }
    public void play() {
        for(var playable : playList) {
            ((Playable) playable).play();
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        var logo = new Frame("片頭 LOGO");

        var playlist1 = new Playlist();
        playlist1.add(new Frame("Yasir 左勾拳"))
                .add(new Frame("Yasir 右勾拳"));

        var playlist2 = new Playlist();
        playlist2.add(new Frame("Kevin 上勾拳"))
                .add(new Frame("Kevin 下勾拳"));
        

        var all = new Playlist();
        all.add(logo)
                .add(playlist1)
                .add(playlist2)
                .play();
    }
}