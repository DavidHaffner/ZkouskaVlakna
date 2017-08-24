
package cz.cvut.fel.pr2;

import java.util.ArrayList;
import java.util.Random;

public class Simulator {

    World world;
    ArrayList participants;
    final int MAX_PLAYERS = 5;
    int round;

    Simulator(World world) {
        this.world = world;
        participants = new ArrayList();
        round = 0;
    }

    public void join(Participant player) {
        if (participants.size() >= MAX_PLAYERS) {
            throw new RuntimeException("Too many players in the game");
        }
        if (player != null && participants.indexOf(player) == -1) {
            participants.add(player);
        }
    }

    public void nextRound() {
        /* nově přidáno vyhodnocení vítězného čísla */
        int winNumber = this.rulete();
        for (int i = 0; i < participants.size(); ++i) {
            Participant player = (Participant) participants.get(i);
            Bet bet = world.doStep(player);
            try {
                this.correctBet(bet);
            } catch (Exception e) {
            System.out.println("Round " + round + " player #" + i + "(" + player + ") bet: " + bet);
            }
            if (winNumber==Integer.parseInt(bet.getBet()))
                System.out.println();           // chybí dopracovat hlášku, který player vyhrál !!!
            else
                System.out.println();
        }
        round++;
    }
    
    public void correctBet (Bet obj) throws Exception {
        int pom = Integer.parseInt(obj.getBet());
        if ((pom >= world.getMinNumber()) && (pom <= world.getMaxNumber())) { 
            throw new Exception ("Wrong bet!");
        } 
    }
    protected int rulete () {
        Random rand = new Random();
        return rand.nextInt(this.world.getMaxNumber());  
    }
}
