package dk.loeschcke.rps.tests;

import dk.loeschcke.rps.logic.ScoreCalculator;
import dk.loeschcke.rps.models.Shape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbugge on 18/05/16.
 */
public class ScoreCalculatorTests {

    private ScoreCalculator sc;

    @Before
    public void setup() {
        this.sc = new ScoreCalculator();
    }

    @Test
    public void assertCircularScoreHierarchy() {
        Assert.assertEquals("ROCK ties with ROCK", 0, sc.calculate(Shape.ROCK, Shape.ROCK));
        Assert.assertEquals("PAPER ties with PAPER", 0, sc.calculate(Shape.PAPER, Shape.PAPER));
        Assert.assertEquals("SCISSORS ties with SCISSORS", 0, sc.calculate(Shape.SCISSORS, Shape.SCISSORS));

        Assert.assertEquals("ROCK beats SCISSORS", 1, sc.calculate(Shape.ROCK, Shape.SCISSORS));
        Assert.assertEquals("PAPER beats ROCK", 1, sc.calculate(Shape.PAPER, Shape.ROCK));
        Assert.assertEquals("SCISSORS beats PAPER", 1, sc.calculate(Shape.SCISSORS, Shape.PAPER));

        Assert.assertEquals("SCISSORS are beaten by ROCK", 2, sc.calculate(Shape.SCISSORS, Shape.ROCK));
        Assert.assertEquals("ROCK is beaten by PAPER", 2, sc.calculate(Shape.ROCK, Shape.PAPER));
        Assert.assertEquals("PAPER is beaten by SCISSORS", 2, sc.calculate(Shape.PAPER, Shape.SCISSORS));
    }

}
