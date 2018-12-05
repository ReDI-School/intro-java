package org.redischool;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<String> board;

    public Board() {
        board = emptyBoard();
    }


    /**
     * @param x    coordinate of a cell
     * @param y    coordinate of a cell
     * @param mark that is inserted if empty
     * @return true if the cell was empty otherwise false.
     */
    public Boolean addMark(int x, int y, String mark) {
        if (board.get(getIndex(x, y)).equals(" ")) {
            board.set(getIndex(x, y), mark);
            return true;
        }
        return false;
    }

    /**
     * @return whether there is a winner
     */
    Boolean isWinning() {
        return (isHorizontal() || isVertical() || isDiagonal());
    }


    /**
     * isDiagonal checks if there is a winner
     *
     * @return true if there is a winner
     */
    private boolean isDiagonal() {
        // check the left to right isDiagonal
        // check if all are same and not empty
        if (board.get(0).equals(board.get(4)) &&
                board.get(4).equals(board.get(8)) &&
                !board.get(0).equals(" ")) {
            return true;
            // check the right to left isDiagonal  ...
        } else return board.get(2).equals(board.get(4)) &&
                board.get(4).equals(board.get(6)) &&
                !board.get(2).equals(" ");
    }

    private boolean isVertical() {
        for (int i = 0; i < 2; i++) {
            if (board.get(i).equals(board.get(i + 3)) &&
                    board.get(i + 3).equals(board.get(i + 6)) &&
                    !board.get(i).equals(" ")) {
                return true;
            }
        }
        return false;
    }

    private boolean isHorizontal() {
        for (int i = 0; i < 2; i++) {
            if (board.get(i * 3).equals(board.get(i * 3 + 1)) &&
                    board.get(i * 3 + 1).equals(board.get(i * 3 + 2)) &&
                    !board.get(i * 3).equals(" ")) {
                return true;
            }
        }
        return false;
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
