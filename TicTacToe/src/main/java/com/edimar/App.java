package com.edimar;

import com.edimar.classes.cpuPlayer.CpuPlayer;
import com.edimar.classes.player.Player;
import com.edimar.classes.ticTacToeGame.TicTacToeGame;

public class App {
    public static void main(String[] args) {

        CpuPlayer cpuPlayer = new CpuPlayer();
        Player player = new Player();

        TicTacToeGame game = new TicTacToeGame();
        player.clearConsole();

        while (!game.isGameOver()) {

            player.playerTurn(game);

            if (game.isGameOver()) {
                break;
            }

            cpuPlayer.cpuTurn(game);

            if (game.isGameOver()) {
                break;
            }

        }

    }

}
