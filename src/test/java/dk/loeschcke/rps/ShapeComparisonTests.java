package dk.loeschcke.rps;

import dk.loeschcke.rps.Game;
import dk.loeschcke.rps.models.Shape;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sbugge on 18/05/16.
 */
public class ShapeComparisonTests {

    @Test
    public void assertCircularScoreHierarchy() {

        Assert.assertEquals("ROCK ties with ROCK", 0, Game.compare(Shape.ROCK, Shape.ROCK));
        Assert.assertEquals("PAPER ties with PAPER", 0, Game.compare(Shape.PAPER, Shape.PAPER));
        Assert.assertEquals("SCISSORS ties with SCISSORS", 0, Game.compare(Shape.SCISSORS, Shape.SCISSORS));

        Assert.assertEquals("ROCK beats SCISSORS", 1, Game.compare(Shape.ROCK, Shape.SCISSORS));
        Assert.assertEquals("PAPER beats ROCK", 1, Game.compare(Shape.PAPER, Shape.ROCK));
        Assert.assertEquals("SCISSORS beats PAPER", 1, Game.compare(Shape.SCISSORS, Shape.PAPER));

        Assert.assertEquals("SCISSORS are beaten by ROCK", 2, Game.compare(Shape.SCISSORS, Shape.ROCK));
        Assert.assertEquals("ROCK is beaten by PAPER", 2, Game.compare(Shape.ROCK, Shape.PAPER));
        Assert.assertEquals("PAPER is beaten by SCISSORS", 2, Game.compare(Shape.PAPER, Shape.SCISSORS));
    }

}
