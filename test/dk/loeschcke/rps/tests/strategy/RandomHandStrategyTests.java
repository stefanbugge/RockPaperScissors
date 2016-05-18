package dk.loeschcke.rps.tests.strategy;

import dk.loeschcke.rps.models.Shape;
import dk.loeschcke.rps.strategy.HandStrategy;
import dk.loeschcke.rps.strategy.RandomHandStrategy;
import dk.loeschcke.rps.util.FakeRandomGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sbugge on 18/05/16.
 */
public class RandomHandStrategyTests {

    @Test
    public void assertRockResult() {
        int rockValue = Shape.ROCK.getValue(); // 0
        HandStrategy strategy = new RandomHandStrategy(new FakeRandomGenerator(rockValue));
        Assert.assertEquals(Shape.ROCK, strategy.execute());
    }

    @Test
    public void assertPaperResult() {
        int paperValue = Shape.PAPER.getValue(); // 1
        HandStrategy strategy = new RandomHandStrategy(new FakeRandomGenerator(paperValue));
        Assert.assertEquals(Shape.PAPER, strategy.execute());
    }

    @Test
    public void assertScissorsResult() {
        int scissorsValue = Shape.SCISSORS.getValue(); // 2
        HandStrategy strategy = new RandomHandStrategy(new FakeRandomGenerator(scissorsValue));
        Assert.assertEquals(Shape.SCISSORS, strategy.execute());
    }

}
