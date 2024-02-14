package classdemo.ch7;

import static java.lang.System.*;

public class Game2 {
    public static void main(String[] args) {
        //只能傳入ActionEnum 實例
        play(ActionEnum.RIGHT);
        play(ActionEnum.UP);
    }

    public static void play(ActionEnum action) {
        out.println(
                switch(action) {
                    case STOP  -> "播放停止動畫";
                    case RIGHT -> "播放向右動畫";
                    case LEFT  -> "播放向左動畫";
                    case UP    -> "播放向上動畫";
                    case DOWN  -> "播放向下動畫";
                }
        );
    }
}
