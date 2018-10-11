public class Game {
    Deck deck;
    Player player1;
    Player player2;

    public Game(Deck deck, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
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


    public void startGame() {
        Card card1 = deck.dealCard();
        player1.receiveCard(card1);
        Card card2 = deck.dealCard();
        player2.receiveCard(card2);
    }
}
