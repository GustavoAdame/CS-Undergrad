public class Card {
    private int cardNumber;
    private static String[] rankNames = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suitNames = { "S", "H", "C", "D"};
    public static final int SPADES = 0, HEARTS = 1, CLUBS = 2, DIAMONDS = 3;
    public static final int ACE = 0, TWO = 1, THREE = 2, FOUR = 3, FIVE = 4, SIX = 5, SEVEN = 6, EIGHT = 7, NINE = 8, TEN = 9, JACK = 10, QUEEN = 11, KING = 12;
    public Card(int n) {
        cardNumber = n;
    }
    public int getRank() {
        return cardNumber % 13;
    }

    public int getSuit() {
        return cardNumber / 13;
    }

    public String getRankName() {
        return rankNames[getRank()];
    }

    public String getSuitName() {
        return suitNames[getSuit()];
    }

    @Override
    public String toString() {
        return getRankName() + getSuitName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            return true;
        } else {
            return false;
        }
    }

}