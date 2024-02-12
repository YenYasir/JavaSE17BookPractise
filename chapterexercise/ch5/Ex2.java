package chapterexercise.ch5;

public class Ex2 {
    private static final int WALL = 2;
    private static final int PATH = 0;
    private static final int MOUSE = 3;
    private static final int EXIT_ROW = 6;
    private static final int EXIT_COL = 5;

    public static void main(String[] args) {
        int[][] maze = {
                {2, 2, 2, 2, 2, 2, 2},
                {0, 0, 0, 0, 0, 0, 2},
                {2, 0, 2, 0, 2, 0, 2},
                {2, 0, 0, 2, 0, 2, 2},
                {2, 2, 0, 2, 0, 2, 2},
                {2, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 0, 2}
        };

        if (solveMaze(maze, 1, 0)) {
            System.out.println("找到了出口！");
        } else {
            System.out.println("沒有找到出口。");
        }
    }

    private static boolean solveMaze(int[][] maze, int row, int col) {
        // 檢查是否越界或遇到牆
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] == WALL) {
            return false;
        }

        // 老鼠走到出口
        if (row == EXIT_ROW && col == EXIT_COL) {
            maze[row][col] = MOUSE;
            printMaze(maze);
            return true;
        }

        // 設置老鼠位置
        maze[row][col] = MOUSE;

        // 往下走
        if (solveMaze(maze, row + 1, col)) {
            return true;
        }

        // 往右走
        if (solveMaze(maze, row, col + 1)) {
            return true;
        }

        // 往上走
        if (solveMaze(maze, row - 1, col)) {
            return true;
        }

        // 往左走
        if (solveMaze(maze, row, col - 1)) {
            return true;
        }

        // 上下左右都無法移動 回溯，該路不通
        maze[row][col] = PATH;
        return false;
    }

    private static void printMaze(int[][] maze) {
        for (int[] row : maze) {
            for (int cell : row) {
                switch (cell) {
                    case WALL:
                        System.out.print("█ ");
                        break;
                    case MOUSE:
                        System.out.print("◇ ");
                        break;
                    case PATH:
                        System.out.print("  ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
