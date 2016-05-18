package dk.loeschcke.rps.util;

import java.util.Random;

/**
 * Created by sbugge on 18/05/16.
 */
public class RandomGenerator implements IRandomGenerator {

    private final Random rnd;

    public RandomGenerator() {
        this.rnd = new Random();
    }

    @Override
    public int nextInt(int bound) {
        return rnd.nextInt(bound);
    }

}
