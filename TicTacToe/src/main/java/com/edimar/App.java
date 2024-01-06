package com.edimar;

import java.util.Scanner;
import com.edimar.classes.cpuPlayer.CpuPlayer;
import com.edimar.classes.player.Player;
import com.edimar.classes.ticTacToeGame.TicTacToeGame;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            playGame(scanner);
            System.out.println("Do you want to play again? Type 'y' for yes or 'n' for no:");
            char answer = scanner.next().toUpperCase().charAt(0);
            playAgain = (answer == 'Y');
        } while (playAgain);

        System.out.println("Thanks for playing!");
    }

    private static void playGame(Scanner scanner) {
        CpuPlayer cpuPlayer = new CpuPlayer();
        Player humanPlayer = new Player();
        TicTacToeGame game = new TicTacToeGame();

        humanPlayer.clearConsole();

        do {
            humanPlayer.playerTurn(game);
            if (game.isGameOver()) {
                break;
            }

            cpuPlayer.cpuTurn(game);
            if (game.isGameOver()) {
                break;
            }

        } while (true);
    }
}