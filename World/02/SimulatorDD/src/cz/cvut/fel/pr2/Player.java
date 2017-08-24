package cz.cvut.fel.pr2;

public abstract class Player implements Participant {

    protected final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Bet doStep(WorldNew world) {
        return doStep((World) world);
    }
}
