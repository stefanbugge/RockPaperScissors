package dk.loeschcke.rps.strategy;

import dk.loeschcke.rps.models.Shape;

import java.util.Random;

/**
 * Created by sbugge on 18/05/16.
 */
public class RandomHandStrategy implements HandStrategy {

    @Override
    public Shape execute() {
        Shape[] shapes = Shape.values();
        int index = new Random().nextInt(shapes.length);
        return shapes[index];
    }

}
