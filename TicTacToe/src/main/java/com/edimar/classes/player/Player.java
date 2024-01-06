package com.edimar.classes.player;

import java.util.Scanner;

import com.edimar.classes.ticTacToeGame.TicTacToeGame;

public class Player {

    public void playerTurn(TicTacToeGame game) {
        Scanner scan = new Scanner(System.in);
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

    }

    public void clearConsole() {
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
