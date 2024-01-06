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

    public boolean askToPlayAgain(Scanner scanner) {
        char answer;
        System.out.println("Do you want to play again? Type 'y' for yes or 'n' for no:");
    
        while (true) {
            String userInput = scanner.next().toUpperCase();
            if (userInput.equals("Y") || userInput.equals("N")) {
                answer = userInput.charAt(0);
                break;
            } else {
                System.out.println("Invalid input. Type 'y' for yes or 'n' for no:");
            }
        }
    
        return answer == 'Y';
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
