package chapterexercise.ch5;



public class Ex4 {
    public static void main(String[] args) {
        var queen = new Queen();
        queen.backtrack();
    }
}

class Queen {

    private int[] queen = new int[8+1];
    // 同欄位是否有皇后，1表示有
    private int[] column = new int[8+1];
    // 右上至左下是否有皇后
    private int[] rup = new int[2*8+1];
    // 左上至右下是否有皇后
    private int[] lup = new int[2*8+1];

    void backtrack() {
        for(var i = 1; i <= 8; i++) {
            column[i] = 1;
        }

        for(var i = 1; i <= 2*8; i++) {
            rup[i] = lup[i] = 1;
        }

        backtrack(1);
    }

    void backtrack(int i) {
        if(i > 8) {
            print();
        }
        else {
            for(var j = 1; j <= 8; j++) {
                if(column[j] == 1 &&
                        rup[i+j] == 1 &&
                        lup[i-j+8] == 1) {
                    queen[i] = j;
                    // 設定為佔用
                    column[j] = rup[i+j] = lup[i-j+8] = 0;
                    backtrack(i+1);
                    column[j] = rup[i+j] = lup[i-j+8] = 1;
                }
            }
        }
    }

    private void print() {
        for(var y = 1; y <= 8; y++) {
            for(var x = 1; x <= 8; x++) {
                System.out.print(queen[y] == x ? " Q" : " .");
            }
            System.out.println();
        }
        System.out.println();
    }
}