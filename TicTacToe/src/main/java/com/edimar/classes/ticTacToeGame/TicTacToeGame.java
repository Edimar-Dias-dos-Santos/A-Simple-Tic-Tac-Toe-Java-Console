package com.edimar.classes.ticTacToeGame;

import com.edimar.classes.ticTacToeBoard.TicTacToeBoard;

public class TicTacToeGame extends TicTacToeBoard {

    public boolean isGameOver() {
        return this.isBoardFull() || this.isGameWon();
    }

    private boolean isGameWon() {

        return checkRows() || checkColumns() || checkDiagonals();
    }

    private boolean isBoardFull() {

        return this.topLeft != ' ' && this.topCenter != ' ' && this.topRight != ' ' &&
                this.middleLeft != ' ' && this.middleCenter != ' ' && this.middleRight != ' ' &&
                this.bottomLeft != ' ' && this.bottomCenter != ' ' && this.bottomRight != ' ';
    }

    public void announceWinner(String player) {

        if (this.isGameWon()) {
            if (player.equals("Player")) {
                System.out.println("Congratulations! Player wins!");
            } else {
                System.out.println("CPU wins! Better luck next time.");
            }
            System.exit(0);

        }
        if (this.isBoardFull() && !this.isGameWon()) {
            System.out.println("Try once more, the game is Tied!");
            System.exit(0);
        }
    }

    private boolean checkRows() {
        return (this.topLeft == this.topCenter && this.topCenter == this.topRight && this.topLeft != ' ') ||
                (this.middleLeft == this.middleCenter && this.middleCenter == this.topRight && this.middleLeft != ' ')
                ||
                (this.bottomLeft == this.bottomCenter && this.bottomCenter == this.bottomRight
                        && this.bottomLeft != ' ');
    }

    private boolean checkColumns() {
        return (this.topLeft == this.middleLeft && this.middleLeft == this.bottomLeft && this.topLeft != ' ') ||
                (this.topCenter == this.middleCenter && this.middleCenter == this.bottomCenter && this.topCenter != ' ')
                ||
                (this.topRight == this.middleRight && this.middleRight == this.bottomRight && this.topRight != ' ');
    }

    private boolean checkDiagonals() {
        return (this.topLeft == this.middleCenter && this.middleCenter == this.bottomRight && this.topLeft != ' ') ||
                (this.topRight == this.middleCenter && this.middleCenter == this.bottomLeft && this.topRight != ' ');
    }

    public void makeMove(String player, int placement) {
        char symbol = (player.equals("CPU")) ? 'O' : 'X';

        switch (placement) {
            case 1:
                this.setTopLeft(symbol);
                break;
            case 2:
                this.setTopCenter(symbol);
                break;
            case 3:
                this.setTopRight(symbol);
                break;
            case 4:
                this.setMiddleLeft(symbol);
                break;
            case 5:
                this.setMiddleCenter(symbol);
                break;
            case 6:
                this.setMiddleRight(symbol);
                break;
            case 7:
                this.setBottomLeft(symbol);
                break;
            case 8:
                this.setBottomCenter(symbol);
                break;
            case 9:
                this.setBottomRight(symbol);
                break;
            default:
                System.out.println("Invalid placement. Choose a number between 1 and 9.");
        }
    }

    public boolean checkIfPlacementAlreadyUsed(int placement) {
        char positionValue = ' ';

        switch (placement) {
            case 1:
                positionValue = this.getTopLeft();
                break;
            case 2:
                positionValue = this.getTopCenter();
                break;
            case 3:
                positionValue = this.getTopRight();
                break;
            case 4:
                positionValue = this.getMiddleLeft();
                break;
            case 5:
                positionValue = this.getMiddleCenter();
                break;
            case 6:
                positionValue = this.getMiddleRight();
                break;
            case 7:
                positionValue = this.getBottomLeft();
                break;
            case 8:
                positionValue = this.getBottomCenter();
                break;
            case 9:
                positionValue = this.getBottomRight();
                break;
            default:
                return false;
        }

        return positionValue != ' ';
    }

}