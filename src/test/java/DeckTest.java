import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Card card;
    Deck deck;

    @Before
    public void before() {
//        card = new Card();
        deck = new Deck();
    }

    @Test
    public void hasArray() {
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void canAddCards() {
        deck.populate();
        assertEquals(52, deck.getCards().size());
    }
}
