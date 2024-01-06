package com.edimar.classes.TicTacToeBoard;

public class TicTacToeBoard {

    protected char topLeft = ' ';
    protected char topCenter = ' ';
    protected char topRight = ' ';
    protected char middleLeft = ' ';
    protected char middleCenter = ' ';
    protected char middleRight = ' ';
    protected char bottomLeft = ' ';
    protected char bottomCenter = ' ';
    protected char bottomRight = ' ';

    private char[] firstRow = { this.topLeft, '|', this.topCenter, '|', this.topRight };
    private char[] secondRow = { '-', '+', '-', '+', '-' };
    private char[] thirdRow = { this.middleLeft, '|', this.middleCenter, '|', middleRight };
    private char[] fourthRow = { '-', '+', '-', '+', '-' };
    private char[] fifthRow = { this.bottomLeft, '|', this.bottomCenter, '|', this.bottomRight };

    protected char[][] gameBoard = { firstRow, secondRow, thirdRow, fourthRow, fifthRow };

    public void printGameBoard() {

        gameBoard[0] = new char[] { this.topLeft, '|', this.topCenter, '|', this.topRight };
        gameBoard[2] = new char[] { this.middleLeft, '|', this.middleCenter, '|', this.middleRight };
        gameBoard[4] = new char[] { this.bottomLeft, '|', this.bottomCenter, '|', this.bottomRight };

        System.out.println();
        System.out.println();

        for (char[] row : this.gameBoard) {

            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    protected void setTopLeft(char playerOrCpuSymbol) {
        this.topLeft = playerOrCpuSymbol;

    }

    protected void setTopCenter(char playerOrCpuSymbol) {
        this.topCenter = playerOrCpuSymbol;
    }

    protected void setTopRight(char playerOrCpuSymbol) {
        this.topRight = playerOrCpuSymbol;
    }

    protected void setMiddleLeft(char playerOrCpuSymbol) {
        this.middleLeft = playerOrCpuSymbol;
    }

    protected void setMiddleCenter(char playerOrCpuSymbol) {
        this.middleCenter = playerOrCpuSymbol;
    }

    protected void setMiddleRight(char playerOrCpuSymbol) {
        this.middleRight = playerOrCpuSymbol;
    }

    protected void setBottomLeft(char playerOrCpuSymbol) {
        this.bottomLeft = playerOrCpuSymbol;
    }

    protected void setBottomCenter(char playerOrCpuSymbol) {
        this.bottomCenter = playerOrCpuSymbol;
    }

    protected void setBottomRight(char playerOrCpuSymbol) {
        this.bottomRight = playerOrCpuSymbol;
    }

    public char getTopLeft() {
        return topLeft;
    }

    public char getTopCenter() {
        return topCenter;
    }

    public char getTopRight() {
        return topRight;
    }

    public char getMiddleLeft() {
        return middleLeft;
    }

    public char getMiddleCenter() {
        return middleCenter;
    }

    public char getMiddleRight() {
        return middleRight;
    }

    public char getBottomLeft() {
        return bottomLeft;
    }

    public char getBottomCenter() {
        return bottomCenter;
    }

    public char getBottomRight() {
        return bottomRight;
    }

}
