package head.and.tail;

import java.util.Objects;

/**
 * time-date 15:17 17.10.2018
 * Coin that can be thrown
 * @author Fariz Mamedow
 * @version 1.0
 */
public class Coin extends Object{
 
    /**
     * @return Coin.Side
     */
    public static Side tossing(){
        return new Side(random(1 , 120) < 60);
    }    
    
    /**
     * @param b
     * @return Coin.Side
     */
    public static Side tossing(boolean b){
        return new Side(b);
    }
    /**
     * @param min
     * @param max
     * @return int
     */
    private static int random(Integer min, Integer max){
        double range = Math.abs(max - min);     
        double result = (Math.random() * range) + (min <= max ? min : max);
        return (int) result;
    } 
    
    /**
     * @author Fariz Mamedow
     * @version 1.0
     **/
    public static class Side extends Object{
        // side == true ? head : tail
        private final Boolean side;

        /**
         * @param side
         */
        public Side(boolean side) {
            this.side = side;
        }
        
        /**
         * @return Side
         */
        public Boolean getSide(){
            return side;
        }
        
        /**
         * @return boolean
         */
        public Boolean isHead(){
            return side == true;
        }
        
        /**
         *
         * @return  boolean
         */
        public Boolean isTail(){
            return side == false;
        }
        
        @Override
        public String toString() {
            return side.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Side)) return false;
            Side lSide = (Side) obj;
            return this.side.hashCode() == lSide.hashCode();
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 11 * hash + Objects.hashCode(this.side);
            return hash;
        }
    }
}
