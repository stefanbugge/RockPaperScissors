package dk.loeschcke.rps.logic;

import dk.loeschcke.rps.models.Shape;

/**
 * Created by sbugge on 18/05/16.
 */
public class ScoreCalculator {

    public int calculate(Shape s1, Shape s2) {
        return (s1.getValue() + 3 - s2.getValue()) % 3;
    }
}
