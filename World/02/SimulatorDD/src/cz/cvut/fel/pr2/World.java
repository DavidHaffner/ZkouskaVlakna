package cz.cvut.fel.pr2;

public class World {

    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 1;

    public int getMinNumber() {
        return MIN_NUMBER;
    }
    public int getMaxNumber() {
        return MAX_NUMBER;
    }

    Bet doStep(Participant player) {
        return player.doStep(this);
    }
}
