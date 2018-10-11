import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Card card;
    Player player;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.ACE);
        player = new Player("Alvaro");
    }

    @Test
    public void playerHasName() {
        assertEquals("Alvaro", player.getName());
    }

    @Test
    public void playerHasCards() {
        player.receiveCard(card);
        assertEquals(1, player.getCards().size());
    }
}
