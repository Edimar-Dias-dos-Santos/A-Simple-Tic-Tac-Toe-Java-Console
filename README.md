# TicTacToe Game

A simple console-based TicTacToe game implemented in Java.

## Table of Contents
- [Overview](#overview)
- [How to Play](#how-to-play)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Build and Run](#build-and-run)
- [Contributing](#contributing)
- [License](#license)

## Overview

This project is a console-based implementation of the classic TicTacToe game. It includes a player versus CPU mode where the CPU makes random moves, and the game announces the winner at the end.

## How to Play

1. Run the application.
2. Enter your placement (1-9) when prompted.
3. The game board will be displayed after each move.
4. The CPU will make its move.
5. Continue taking turns until the game ends.
6. The winner or a draw will be announced.

## Project Structure

The project is structured as follows:

- **`com.edimar`**: Main package for the application.
  - **`App.java`**: The entry point of the application.
- **`com.edimar.classes.cpuPlayer`**: Package containing the CPU player logic.
  - **`CpuPlayer.java`**: Class representing the CPU player.
- **`com.edimar.classes.player`**: Package containing the player logic.
  - **`Player.java`**: Class representing the human player.
- **`com.edimar.classes.ticTacToeBoard`**: Package containing the TicTacToe game board logic.
  - **`TicTacToeBoard.java`**: Class representing the game board.
- **`com.edimar.classes.ticTacToeGame`**: Package containing the main game logic.
  - **`TicTacToeGame.java`**: Class managing the overall game.

## Dependencies

This project doesn't have any external dependencies.

## Build and Run

To build and run the project, you can use the provided Maven configuration. Simply execute the following command:

```bash
mvn clean package
java -jar target/TicTacToe-1.0-SNAPSHOT.jar
