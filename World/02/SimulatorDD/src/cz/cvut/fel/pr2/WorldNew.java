package cz.cvut.fel.pr2;

public class WorldNew extends World {

    private final String[] fields;

    public WorldNew() {
        super();
        fields = new String[36 + 1 + 4];
        fields[0] = "even";
        fields[1] = "odd";
        fields[2] = "red";
        fields[3] = "black";
        for (int i = 0; i <= 36; ++i) {
            fields[i + 4] = Integer.toString(i);
        }
    }

    public String[] getFields() {
        return fields;
    }

    @Override
    Bet doStep(Participant player) {
        return player.doStep(this);
    }
}
