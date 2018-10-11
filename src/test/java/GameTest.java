import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Deck deck;
    Player player1;
    Player player2;
    Game game;

    @Before
    public void before() {
        deck = new Deck();
        deck.populate();
        player1 = new Player("Jesse");
        player2 = new Player("Alvaro");
        game = new Game(deck, player1, player2);
    }

    @Test
    public void hasPlayers() {
        assertEquals(player1, game.getPlayer1());
        assertEquals(player2, game.getPlayer2());
    }

    @Test
    public void hasDeck() {
        assertEquals(deck, game.getDeck());
    }

    @Test
    public void gameCanStart() {
        game.startGame();
        assertEquals(50, game.getDeck().getCards().size());
        assertEquals(1, game.getPlayer1().getCards().size());
        assertEquals(1, game.getPlayer2().getCards().size());
    }

}
