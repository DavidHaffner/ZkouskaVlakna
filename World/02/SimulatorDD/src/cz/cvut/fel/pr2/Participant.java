package cz.cvut.fel.pr2;

public interface Participant {

    public Bet doStep(World world);

    public Bet doStep(WorldNew world);

}
