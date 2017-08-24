package cz.cvut.fel.pr2;

class Demo {

    public static void main(String[] args) {
        //Simulator sim = new Simulator(new World());
        //Simulator sim = new Simulator(new WorldZero());
        Simulator sim = new Simulator(new WorldNew());
        sim.join(new RandomPlayer());
        sim.join(new RedPlayer());
        sim.join(new MinPlayer());
        sim.join(new PlayerNew());

        for (int i = 0; i < 3; ++i) {
            System.out.println("Round number: " + i);
            sim.nextRound();
        }
    }
}
