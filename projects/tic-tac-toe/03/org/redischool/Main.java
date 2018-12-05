package org.redischool;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Board board = new Board();
        board.addMark();
        board.print();

        while(true) {
            readUserInput(board, "First player", "X");
            board.print();
            if(board.isWinning()){
                System.out.println("First player has won!");
                return;
            }
            readUserInput(board, "Second player", "O");
            board.print();
            if(board.isWinning()){
                System.out.println("Second player has won!");
                return;
            }
        }
    }

    private static void readUserInput(Board board, String userName, String mark) {
        System.out.println(userName + "!");
        int x = getValue("x");
        int y = getValue("y");
        while (!board.addMark(x, y, mark)) {
            x = getValue("x");
            y = getValue("y");
        }
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
}
