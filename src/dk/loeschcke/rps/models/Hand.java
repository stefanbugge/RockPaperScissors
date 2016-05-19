package dk.loeschcke.rps.models;

import dk.loeschcke.rps.strategy.IHandStrategy;

/**
 * Created by sbugge on 18/05/16.
 */
public class Hand {

    private final String name;
    private IHandStrategy strategy;

    public Hand(String name, IHandStrategy handStrategy) {
        this.name = name;
        this.strategy = handStrategy;
    }

    public Shape throwShape() {
        return strategy.execute();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "name='" + name + '\'' +
                '}';
    }
}
