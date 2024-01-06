package com.edimar.classes.cpuPlayer;

import java.util.Random;

import com.edimar.classes.ticTacToeGame.TicTacToeGame;

public class CpuPlayer {

    public void cpuTurn(TicTacToeGame game) {

        Random rand = new Random();
        int cpuPlacement = rand.nextInt(9) + 1;

        while (game.checkIfPlacementAlreadyUsed(cpuPlacement)) {
            cpuPlacement = rand.nextInt(9) + 1;
        }

        game.makeMove("CPU", cpuPlacement);
        game.announceWinner("CPU");

    }

}
