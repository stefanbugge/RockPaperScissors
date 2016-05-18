package dk.loeschcke.rps;

public class Main {

    public static void main(String[] args) {
        int iterations = 100;
        if (args != null && args.length > 0) {
            iterations = Integer.parseInt(args[0], 10);
        }
        new Game(iterations);
    }
}
