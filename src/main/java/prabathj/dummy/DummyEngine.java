package main.java.prabathj.dummy;



import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import main.java.prabathj.api.GameEngine;

import static java.lang.String.format;

public class DummyEngine implements GameEngine {

    private static final AtomicInteger TURNS = new AtomicInteger(0);
    private final Random random = new Random();

    @Override
    public String startGame(Integer numberOfPlayers) {
        return "Game starting...";
    }

    @Override
    public boolean gameIsRunning() {
        int turns = TURNS.get();
        return turns < 5;
    }

    @Override
    public String nextPlayer() {
        return format("Player %d", random.nextInt(4) + 1);
    }

    @Override
    public String nextPlayerTurn(Integer input) {
        TURNS.incrementAndGet();
        return "Player x is doing something";
    }
}
