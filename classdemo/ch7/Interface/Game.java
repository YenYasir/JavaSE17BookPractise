package classdemo.ch7.Interface;

import classdemo.ch7.Enum.Action;

import static java.lang.System.out;

public class Game {
    public static void main(String[] args) {
        play(classdemo.ch7.Enum.Action.RIGHT);
        play(classdemo.ch7.Enum.Action.UP);
    }

    public static void play(int action) {
        out.println(
                switch(action) {
                    case classdemo.ch7.Enum.Action.STOP  -> "播放停止動畫";
                    case classdemo.ch7.Enum.Action.RIGHT -> "播放向右動畫";
                    case classdemo.ch7.Enum.Action.LEFT  -> "播放向左動畫";
                    case classdemo.ch7.Enum.Action.UP    -> "播放向上動畫";
                    case Action.DOWN  -> "播放向下動畫";
                    default           -> "不支援此動作";
                }
        );
    }
}
