package main.java.prabathj.simulation;

import main.java.prabathj.api.GameEngine;
import main.java.prabathj.dummy.DummyEngine;

import java.io.*;

import static java.lang.String.format;

public class Simulation {

    private static final Boolean USE_DUMMY_ENGINE = Boolean.TRUE;

    public static void main(String[] args) {
       GameEngine gameEngine = locateGameEngine();
        startGame(gameEngine);

        while(gameEngine.gameIsRunning()) {
            nextTurn(gameEngine);
        }

        System.out.println("Congratulations, the game has ended. Please play again soon...");
    }

    private static void startGame(GameEngine gameEngine) {
        System.out.println("The game is starting...");
        System.out.print("Please enter the number of players (2-4):");
        Integer input = null;
        while(true) {
            input = userInput();
            if (input != null && input >= 2 && input <= 4) {
                break;
            } else {
                System.err.println("Please enter a number between 2 and 4.");
            }
        }
        String gameEngineInformation = gameEngine.startGame(input);
        System.out.println(gameEngineInformation);
    }

    private static void nextTurn(GameEngine gameEngine) {
        System.out.print(format("The next player is %s. Please enter the dice number: ", gameEngine.nextPlayer()));
        Integer input = null;
        while(true) {
            input = userInput();
            if (input != null && input >= 1 && input <= 6) {
                break;
            } else {
                System.err.println("Please enter a number between 1 and 6.");
            }
        }
        String gameEngineInformation = gameEngine.nextPlayerTurn(input);
        System.out.println(gameEngineInformation);
    }

    private static GameEngine locateGameEngine() {
        if (USE_DUMMY_ENGINE) {
            return new DummyEngine();
        }
        throw new IllegalStateException("Working engine not yet implemented!");
    }

    private static Integer userInput()
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            Integer value = Integer.valueOf(line);
            return value;
        } catch (IOException | NumberFormatException e) {
            System.err.println("Invalid user input. Please try again");
            return null;
        }
    }
}
