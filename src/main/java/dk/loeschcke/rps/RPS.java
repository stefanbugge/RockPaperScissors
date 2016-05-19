package dk.loeschcke.rps;

import dk.loeschcke.rps.models.Hand;
import dk.loeschcke.rps.models.Shape;
import dk.loeschcke.rps.strategy.FixedHandStrategy;
import dk.loeschcke.rps.strategy.RandomHandStrategy;
import dk.loeschcke.rps.util.RandomGenerator;

public class RPS {

    public RPS(int iterations) {

        Hand h1 = new Hand("h1", new FixedHandStrategy(Shape.ROCK));
        Hand h2 = new Hand("h2", new RandomHandStrategy(new RandomGenerator()));

        Game game = new Game(h1, h2);

        int i = 0;
        while (i < iterations) {

            Hand winner = game.play();
            if (winner == null) {
                System.out.println("TIE");
            } else {
                System.out.println("Winner: " + winner.getName());
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        int iterations = 100;
        if (args != null && args.length > 0) {
            iterations = Integer.parseInt(args[0], 10);
        }
        new RPS(iterations);
    }
}
