package dk.loeschcke.rps.util;

/**
 * Created by sbugge on 18/05/16.
 */
public class FakeRandomGenerator implements IRandomGenerator {

    private int output;

    public FakeRandomGenerator(int output) {
        this.output = output;
    }

    @Override
    public int nextInt(int bound) {
        return output;
    }
}
