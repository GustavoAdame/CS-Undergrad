import java.util.Random;
public class Deck{
    private Card[] cards = new Card[52];
    private int nextCard; 
    private Random rand; 
    public Deck() {
        for(int numCard = 0; numCard < cards.length; ++numCard){
                cards[numCard] = new Card(numCard);
        }
        rand = new Random();
    }
    public void shuffle(){
        for(int i = 0; i < cards.length; ++i){
           int rand = (int)(Math.random()*(i+1));
           Card temp = cards[i];
           cards[i] = cards[rand];
           cards[rand] = temp;
        }
        nextCard = 0;
    }
    public Card dealCard(){
        if(nextCard == cards.length){
            shuffle();
            return cards[nextCard++];
        } else{
            return cards[nextCard++];
        }
    }
    public int getCardsRemaining(){
        return cards.length - nextCard;
    }
}