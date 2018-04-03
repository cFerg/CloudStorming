package elite.math.trig.triangle;

import elite.math.SquareRoot;

/**
 *
 * @author CFerg (Elite)
 */
public class Opposite {

    /**
     *
     */
    public double opposite;
    
    /**
     *
     */
    public Opposite(){
        this.opposite = 0.0;
    }
    
    /**
     *
     * @param a
     * @param h
     */
    public Opposite(Adjacent a, Hypotenuse h){
        this.opposite = new SquareRoot((h.hypotenuse * h.hypotenuse) - (a.adjacent * a.adjacent)).squareRoot;
    }
}