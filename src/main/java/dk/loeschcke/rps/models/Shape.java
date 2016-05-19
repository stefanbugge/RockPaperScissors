package dk.loeschcke.rps.models;

/**
 * Created by sbugge on 18/05/16.
 */
public enum Shape {

    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private final int score;

    Shape(int i) {
        this.score = i;
    }

    public int getValue() {
        return this.score;
    }

}
