/**
 * This class runs the game by creating a new instance of gameLoop and calling runGame().
 * It closes the scanner after the game is complete.
 */
public class main1 {

    public static void main(String[] args) {
        gameLoop game = new gameLoop();
        game.runGame();

        userIO.closeScanner();

    }

}
