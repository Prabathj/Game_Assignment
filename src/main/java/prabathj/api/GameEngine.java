package main.java.prabathj.api;



public interface GameEngine {

	//Initializes a new game with the number of players.
    String startGame(Integer numberOfPlayers);

    //While no player has collected more than 30 points, the game is still running.
    boolean gameIsRunning();

    /**
     * Returns which player is next in line, e.g. 'Player 3'.
     * This call does NOT advances the player.
     * */
    String nextPlayer();

    /**
     * Advances the player which turn it is the given number of points; activates the bonus or trap if necessary and
     * returns a (very) telling message about what just happened and the general game situation.
     * */
    String nextPlayerTurn(Integer input);
}
