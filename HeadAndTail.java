package head.and.tail;

/**
 *
 * @author Fariz Mamedow
 */
public class HeadAndTail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Coin.tossing());
        
        Coin.Side side = Coin.tossing();
        if(side.isHead()) System.out.println("head");
        if(side.isTail()) System.out.println("tail");
    }
}
