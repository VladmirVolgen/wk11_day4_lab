import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void recieveCard(Card card) {
       cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


}
