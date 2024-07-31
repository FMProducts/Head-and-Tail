package head.and.tail;

/**
 * @author Fariz Mamedow
 */
public class HeadAndTail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Coin.tossing());

        Side side = Coin.tossing();
        System.out.println(side);
    }
}
