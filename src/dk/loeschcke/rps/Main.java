package dk.loeschcke.rps;

import dk.loeschcke.rps.models.Hand;
import dk.loeschcke.rps.models.Shape;
import dk.loeschcke.rps.strategy.FixedHandStrategy;
import dk.loeschcke.rps.strategy.RandomHandStrategy;
import dk.loeschcke.rps.util.RandomGenerator;

public class Main {

    public static void main(String[] args) {
        int iterations = 100;
        if (args != null && args.length > 0) {
            iterations = Integer.parseInt(args[0], 10);
        }

        Hand h1 = new Hand("1", new FixedHandStrategy(Shape.ROCK));
        Hand h2 = new Hand("2", new RandomHandStrategy(new RandomGenerator()));

        Game game = new Game(h1, h2);

        int i = 0;
        while (i < iterations) {

            game.play();

            i++;
        }

    }
}
