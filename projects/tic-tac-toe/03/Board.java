package org.redischool;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<String> board;

    public Board() {
        board = emptyBoard();
    }

    public Boolean addMark(int x, int y, String mark) {
        int index = getIndex(x, y);
        if (board.get(index).equals(" ")) {
            board.set(index, mark);
            return true;
        }
        return false;
    }

    Boolean isWinning() {
        if (horizontal()) return true;
        if (vertical()) return true;
        if (diagonal()) return true;
        return false;
    }

    private boolean diagonal() {
        if (board.get(0).equals(board.get(4)) &&
                board.get(4).equals(board.get(8)) &&
                !board.get(0).equals(" ")) {
            return true;
        } else if(board.get(2).equals(board.get(4)) &&
                board.get(4).equals(board.get(6)) &&
                !board.get(2).equals(" ")) {
            return true;
        }
        return false;
    }

    private boolean vertical() {
        for (int i = 0; i < 2; i++) {
            if (board.get(i).equals(board.get(i + 3)) &&
                    board.get(i + 3).equals(board.get(i + 6)) &&
                    !board.get(i).equals(" ")) {
                return true;
            }
        }
        return false;
    }

    private boolean horizontal() {
        for (int i = 0; i < 2; i++) {
            int row = i * 3;
            if (board.get(row + 0).equals(board.get(row + 1)) &&
                    board.get(row + 1).equals(board.get(row + 2)) &&
                    !board.get(row + 0).equals(" ")) {
                return true;
            }
        }
        return false;
    }

    String getMark(int x, int y) {
        int index = getIndex(x, y);
        return board.get(index);
    }

    void print() {
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + board.get(i) + "]");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }
    }

    private int getIndex(int x, int y) {
        return 3 * y + x;
    }

    private static ArrayList<String> emptyBoard() {
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            board.add(" ");
        }
        return board;
    }

}
