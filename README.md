#TicTacToe Game
A simple TicTacToe game implemented in Java.

Table of Contents
Overview
How to Play
Project Structure
Dependencies
Build and Run
Contributing
License
Overview
This project is a console-based implementation of the classic TicTacToe game. It includes a player versus CPU mode where the CPU makes random moves, and the game announces the winner at the end.

How to Play
Run the application.
Enter your placement (1-9) when prompted.
The game board will be displayed after each move.
The CPU will make its move.
Continue taking turns until the game ends.
The winner or a draw will be announced.
Project Structure
The project is structured as follows:

com.edimar: Main package for the application.
App.java: The entry point of the application.
com.edimar.classes.cpuPlayer: Package containing the CPU player logic.
CpuPlayer.java: Class representing the CPU player.
com.edimar.classes.player: Package containing the player logic.
Player.java: Class representing the human player.
com.edimar.classes.ticTacToeBoard: Package containing the TicTacToe game board logic.
TicTacToeBoard.java: Class representing the game board.
com.edimar.classes.ticTacToeGame: Package containing the main game logic.
TicTacToeGame.java: Class managing the overall game.
Dependencies
This project doesn't have any external dependencies.

Build and Run
To build and run the project, you can use the provided Maven configuration. Simply execute the following command:

bash
Copy code
mvn clean package
java -jar target/TicTacToe-1.0-SNAPSHOT.jar
Contributing
Feel free to contribute to the project by opening issues or submitting pull requests.

License
This project is licensed under the MIT License.

