import java.lang.reflect.Array;
import java.util.*;

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

    public void shuffle() {
        Collections.shuffle(cards);
    }

//    public void shuffle() {
//        Random rnd = new Random();
//        for (int i = 0; i < this.cards.size(); i++) {
//            int randomPosition = rnd.nextInt(this.cards.size());
//            Card temp = this.cards.get(i);
//            this.cards.get(i) = this.cards.get(randomPosition);
//            this.cards.get(randomPosition) = temp;
//
//        }
//    }
}
