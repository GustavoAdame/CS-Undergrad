public class Dealer extends Player {
    public Dealer(String name) {
        super(name);
    }
    @Override
    public int nextAction() {
        if (handValue() >= 17) {
            return Player.STAY;
        } else {
            return Player.HIT;
        }
    }
}