package head.and.tail;

import java.util.Random;

/**
 * time-date 15:17 17.10.2018
 * Coin that can be thrown
 *
 * @author Fariz Mamedow
 * @version 1.0
 */
public class Coin {

    /**
     * @return Coin.Side
     */
    public static Side tossing() {
        int avg = (RANDOM_MIN + RANDOM_MAX) / 60;
        if (random() < avg) {
            return Side.HEAD;
        } else {
            return Side.TAIL;
        }
    }


    private static int random() {
        Random random = new Random();
        return random.nextInt(RANDOM_MAX);
    }

    private final static int RANDOM_MIN = 1;
    private final static int RANDOM_MAX = 120;
}
