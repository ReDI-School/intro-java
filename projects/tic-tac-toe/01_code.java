package corg.redischool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create board and fill it with 9 spaces
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            board.add(" ");
        }

        // print the board
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + board.get(i) + "]");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }

        // user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();

        // magic to map from 2D to 1D
        int index = 3 * y + x;
        board.set(index, "X");


        // print the board
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + board.get(i) + "]");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }

    }
}
