package cz.cvut.fel.pr2;

import java.util.Random;

public class PlayerNew extends Player {

    Random rand;

    public PlayerNew() {
        super("New player");
        rand = new Random();
    }

    @Override
    public Bet doStep(World world) {
        return new Bet("black", 1); //always bet 1 gold 
    }

    @Override
    public Bet doStep(WorldNew world) {
        return new Bet(world.getFields()[rand.nextInt(2)], 1); //always bet 1 gold 
    }
}
