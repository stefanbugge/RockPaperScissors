package dk.loeschcke.rps.tests.strategy;

import dk.loeschcke.rps.models.Shape;
import dk.loeschcke.rps.strategy.FixedHandStrategy;
import dk.loeschcke.rps.strategy.IHandStrategy;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sbugge on 18/05/16.
 */
public class FixedHandStrategyTests {

    @Test
    public void assertFixedResults() {
        IHandStrategy strategy = new FixedHandStrategy(Shape.ROCK);
        Assert.assertEquals(Shape.ROCK, strategy.execute());
        Assert.assertEquals(Shape.ROCK, strategy.execute());
        Assert.assertEquals(Shape.ROCK, strategy.execute());
    }
}
