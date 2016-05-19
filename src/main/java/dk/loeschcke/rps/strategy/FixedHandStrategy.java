package dk.loeschcke.rps.strategy;

import dk.loeschcke.rps.models.Shape;

/**
 * Created by sbugge on 18/05/16.
 */
public class FixedHandStrategy implements IHandStrategy {

    private Shape fixedShape;

    public FixedHandStrategy(Shape fixedShape) {
        this.fixedShape = fixedShape;
    }

    @Override
    public Shape execute() {
        return fixedShape;
    }
}
