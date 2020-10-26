package ru.job4j.puzzle;

public class Win {
    public static boolean checkRow(int row, int[][] board) {
        int k = 0;
        for (int elem : board[row]) {
            k = (elem == 1) ? k + 1 : k;
        }
        return k == board.length;
    }

    public static boolean checkColumn(int column, int[][] board) {
        int k = 0;
        for (int i = 0; i < board.length; i++) {
            k = (board[i][column] == 1) ? k + 1 : k;
        }
        return k == board.length;
    }

    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (checkRow(i, board) || checkColumn(i, board)) {
                return true;
            }
        }
        return false;
    }
}
