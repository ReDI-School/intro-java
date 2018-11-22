package org.redischool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create board and fill it with 9 spaces
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            board.add(" ");
        }
        printTheBoard(board);

        readUserInput(board, "First player", "X");
        readUserInput(board,"Second player", "O");

    }

    private static void readUserInput(ArrayList<String> board, String userName, String sign) {
        System.out.println(userName + "!");
        int x = getValue("x");
        int y = getValue("y");
        // magic to map from 2D to 1D
        int index = 3 * y + x;
        while (!board.get(index).equals(" ")) {
            x = getValue("x");
            y = getValue("y");
            index = 3 * y + x;
        }

        board.set(index, sign);
        printTheBoard(board);
    }

    private static int getValue(String valueName) {
        System.out.println("Enter " + valueName + ": ");
        int input = scanner.nextInt();
        while ((input > 2) || (input < 0)) {
            System.out.println(valueName + " has to be between 0 and 2, try again:");
            input = scanner.nextInt();
        }
        return input;
    }

    private static void printTheBoard(ArrayList<String> board) {
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + board.get(i) + "]");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }
    }
}
