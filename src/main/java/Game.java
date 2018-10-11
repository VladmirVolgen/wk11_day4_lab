import java.util.ArrayList;

public class Game {
    Deck deck;
    Player player1;
    Player player2;
    int player1score;
    int player2score;

    public Game(Deck deck, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
        this.player1score = 0;
        this.player2score = 0;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Deck getDeck() {
        return deck;
    }

    public void startSimpleGame() {
        Card card1 = deck.dealCard();
        player1.receiveCard(card1);
        Card card2 = deck.dealCard();
        player2.receiveCard(card2);
    }

    public String playTurn() {
        int p1Card = player1.getCards().get(0).getValueFromEnum();
        int p2Card = player2.getCards().get(0).getValueFromEnum();
        if (p1Card > p2Card) {
            player1score += 1;
            return toString().format("%s won and %s lost!", player1.getName(), player2.getName());
        } else if (p1Card < p2Card) {
            player2score += 1;
            return toString().format("%s won and %s lost!", player2.getName(), player1.getName());
        } else {
            player1score += 1;
            player2score += 1;
            return "It's a draw!";
        }
    }

    public void startGame(int numberOfCards) {
        ArrayList<Card> cards1 = deck.dealCards(numberOfCards*2);
        for (int i = 0; i < numberOfCards; i++) {
            player1.receiveCard(cards1.get(0));
            player2.receiveCard(cards1.get(0));
        }
    }

    public String playTurns() {
        int turns = player1.getCards().size();
        for (int i = 0; i < turns; i++) {
            this.playTurn();
        }
        return toString().format("%s's score is %d and %s's score is %d", player1.getName(), player1score, player2.getName(), player2score);
    }
}
