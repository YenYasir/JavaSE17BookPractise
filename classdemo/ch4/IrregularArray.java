package classdemo.ch4;

public class IrregularArray {
    public static void main(String[] args) {
        //宣告arr參考的物件有兩個索引
        int[][] arr = new int[2][];
        arr[0] = new int[] {1, 2, 3, 4, 5};
        arr[1] = new int[] {1, 2, 3};

        for(int[] row : arr) {
            for(int value : row) {
                System.out.printf("%2d", value);
            }
            System.out.println();
        }
    }
}
