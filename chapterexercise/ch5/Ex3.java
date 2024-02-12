package chapterexercise.ch5;

import java.util.Scanner;

public class Ex3 {
    private static final int N = 8;
    // 對應騎士可走的八個方向
    private static final int[] rowMove = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] colMove = {1, 2, 2, 1, -1, -2, -2, -1};

    private static boolean isSafe(int x, int y, int[][] board) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == 0);
    }

    private static boolean solveKT(int[][] board, int startX, int startY, int moveCount) {
        board[startX][startY] = moveCount;

        if (moveCount == N * N) { // 所有位置都走過了，則找到解
            printSolution(board);
            return true;
        }
        // 嘗試所有可能
        for (int i = 0; i < N; i++) {
            int nextX = startX + rowMove[i];
            int nextY = startY + colMove[i];
            if (isSafe(nextX, nextY, board)) {
                if (solveKT(board, nextX, nextY, moveCount + 1)) {
                    return true;
                } else {
                    board[nextX][nextY] = 0; // 回溯，取消該位置的標號
                }
            }
        }
        return false;
    }

    private static void printSolution(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[][] board = new int[N][N];

        // 從每個位置開始嘗試
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 初始化棋盤
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        board[k][l] = 0;
                    }
                }
                solveKT(board, i, j, 1);
            }
        }
    }
}


