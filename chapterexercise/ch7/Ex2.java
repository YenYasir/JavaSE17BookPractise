package chapterexercise.ch7;


import java.util.*;

interface AnimationComponent  {
    void display();
}
//採用composite pattern可以拆開影格 圖片等素材 來設計 以達到自由加減播放清單內容
class Frame implements AnimationComponent {
    private String frameContent;
    Frame(String frameContent) {
        this.frameContent = frameContent;
    }
    public void display() {
        System.out.println("投影 " + frameContent);
    }
}

class Playlist implements AnimationComponent {
    private List<AnimationComponent> animations = new ArrayList<>();

    public Playlist add(AnimationComponent animationComponent) {
        animations.add(animationComponent);
        return this;
    }
    public void removeComponent(AnimationComponent animationComponent) {
        animations.remove(animationComponent);
    }

    @Override
    public void display() {
        System.out.println("播放動畫清單: ");
        for (AnimationComponent animation : animations) {
            animation.display();
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Frame frame1 = new Frame("巨人 片段");
        Frame frame2 = new Frame("喰種 片段");


        Playlist playlist = new Playlist();
        playlist.add(frame1);
        playlist.add(frame2);


        Playlist anoPlaylist = new Playlist();
        anoPlaylist.add(new Frame("魔圓 片段"));
        anoPlaylist.add(new Frame("Fate 片段"));


        playlist.add(anoPlaylist);


        playlist.display();
    }
}