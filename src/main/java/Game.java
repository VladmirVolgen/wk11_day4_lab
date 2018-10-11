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

    public String playTurn() {
        int p1Card = player1.getCards().get(0).getValueFromEnum();
        int p2Card = player2.getCards().get(0).getValueFromEnum();
        if (p1Card > p2Card) {
            return toString().format("%s won and %s lost!", player1.getName(), player2.getName());
        } else if (p1Card < p2Card) {
            return toString().format("%s won and %s lost!", player2.getName(), player1.getName());
        } else {
            return "It's a draw!";
        }
    }
}
