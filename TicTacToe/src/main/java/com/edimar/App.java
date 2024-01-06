package com.edimar;

import java.util.Random;
import java.util.Scanner;

import com.edimar.classes.TicTacToeGame.TicTacToeGame;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TicTacToeGame game = new TicTacToeGame();
        clearConsole();

        while (!game.isGameOver()) {

            System.out.println("Enter your placement 1-9: ");
            game.printGameBoard();
            System.out.println();
            int playerPlacement = scan.nextInt();
 

            while (game.checkIfPlacementAlreadyUsed(playerPlacement)) {
                clearConsole();
                System.out.println("Position taken!, Enter a correct Position");
                game.printGameBoard();
                playerPlacement = scan.nextInt();
            }

            game.makeMove("Player", playerPlacement);
            clearConsole();
            game.announceWinner("Player");

            if (game.isGameOver()) {
                break;
            }

            cpuTurn(game);

            if (game.isGameOver()) {
                break;
            }

        }

    }

    public static void cpuTurn(TicTacToeGame game) {

        Random rand = new Random();
        int cpuPlacement = rand.nextInt(9) + 1;

        while (game.checkIfPlacementAlreadyUsed(cpuPlacement)) {
            cpuPlacement = rand.nextInt(9) + 1;
        }

        game.makeMove("CPU", cpuPlacement);
        game.announceWinner("CPU");

    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {

        }
    }

}
