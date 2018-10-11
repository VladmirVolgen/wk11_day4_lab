import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void populate() {
        for (SuitType suit : SuitType.values()) {

            for (RankType rank : RankType.values()) {
                this.cards.add(new Card(suit, rank));
            }
        }
    }
}
