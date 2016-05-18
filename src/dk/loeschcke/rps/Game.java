package dk.loeschcke.rps;

import dk.loeschcke.rps.logic.ScoreCalculator;
import dk.loeschcke.rps.models.Hand;
import dk.loeschcke.rps.models.Shape;
import dk.loeschcke.rps.strategy.FixedHandStrategy;
import dk.loeschcke.rps.strategy.RandomHandStrategy;
import dk.loeschcke.rps.util.RandomGenerator;

/**
 * Created by sbugge on 18/05/16.
 */
public class Game {

    public Game(int iterations) {

        Hand h1 = new Hand("1", new FixedHandStrategy(Shape.ROCK));
        Hand h2 = new Hand("2", new RandomHandStrategy(new RandomGenerator()));

        ScoreCalculator sc = new ScoreCalculator();

        int i = 0;
        while (i < iterations) {

            Shape s1 = h1.throwShape();
            Shape s2 = h2.throwShape();

            System.out.println((i+1) + ": " + h1 + " = " + s1 + "; " + h2 + " = " + s2 + "; winner = " + sc.calculate(s1, s2));

            i++;
        }

    }
}
