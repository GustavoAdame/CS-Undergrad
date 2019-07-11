import java.util.ArrayList;
import java.util.Arrays;

public class Hand {
    ArrayList<Card> cards;
    public Hand() {
        cards = new ArrayList<Card>();
    }

    @Override
    public String toString() {
       String output = "";
        for (int i = 0; i < cards.size(); ++i){
            output += cards.get(i);
        }
        return output;
    }
    
    public int hardValue() {
        int val = 0;
        for (Card player : cards) {
            if (player.getRankName().equals("A")) {
                val += 1;
            } else if (player.getRankName().equals("J")) {
                val += 10;
            } else if (player.getRankName().equals("Q")) {
                val += 10;
            } else if (player.getRankName().equals("K")) {
                val += 10;
            } else {
                val += Integer.parseInt(player.getRankName());
            }
        }
        return val;
    }

    public int softValue() {
        int val = 0;
        for (Card player : cards) {
            if (player.getRankName().equals("A")) {
                val += 11;
            } else if (player.getRankName().equals("J")) {
                val += 10;
            } else if (player.getRankName().equals("Q")) {
                val += 10;
            } else if (player.getRankName().equals("K")) {
                val += 10;
            } else {
                val += Integer.parseInt(player.getRankName());
            }
        }
        return val;
    }

    public void acceptCard(Card c) {
        if (c == null) {
            throw new IllegalArgumentException("Card cannot be null");
        }
        cards.add(c);
    }

}