package dk.loeschcke.rps;

import dk.loeschcke.rps.models.Hand;
import dk.loeschcke.rps.models.Shape;

/**
 * Created by sbugge on 18/05/16.
 */
public class Game {

    private Hand h1;
    private Hand h2;

    public Game(Hand h1, Hand h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    /**
     * @param s1 Shape 1
     * @param s2 Shape 2
     * @return circular method that will always return either 0, 1 or 2.
     *          0 = tie
     *          1 = s1 beats s2
     *          2 = s2 beats s1
     */
    public static int compare(Shape s1, Shape s2) {
        return (s1.getValue() + 3 - s2.getValue()) % 3;
    }

    public Hand play() {

        Shape s1 = h1.throwShape();
        Shape s2 = h2.throwShape();

        int result = compare(s1, s2);

        System.out.println(h1.getName() + "(" + s1 + ") vs " + h2.getName() + "(" + s2 + ")");

        Hand winner = null;
        if (result == 1) winner = h1;
        if (result == 2) winner = h2;
        return winner;
    }

}
