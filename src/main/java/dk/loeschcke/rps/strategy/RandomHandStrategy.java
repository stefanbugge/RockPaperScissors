package dk.loeschcke.rps.strategy;

import dk.loeschcke.rps.models.Shape;
import dk.loeschcke.rps.util.IRandomGenerator;

/**
 * Created by sbugge on 18/05/16.
 */
public class RandomHandStrategy implements IHandStrategy {

    private IRandomGenerator randomGenerator;

    public RandomHandStrategy(IRandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    @Override
    public Shape execute() {
        Shape[] shapes = Shape.values();
        int index = randomGenerator.nextInt(shapes.length);
        return shapes[index];
    }

}
