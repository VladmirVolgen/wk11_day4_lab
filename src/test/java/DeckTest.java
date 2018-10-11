import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void canRandomise() {
        deck.populate();
        ArrayList<Card> sortedCards = deck.getCards();
        deck.shuffle();
        assertEquals(sortedCards, deck.getCards());
    }

    @Test
    public void canDealCard() {
        deck.populate();
        deck.dealCard();
        assertEquals(51, deck.getCards().size());
    }
}
