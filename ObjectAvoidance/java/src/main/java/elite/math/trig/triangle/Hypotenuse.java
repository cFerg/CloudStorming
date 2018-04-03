package elite.math.trig.triangle;

import elite.math.SquareRoot;

/**
 *
 * @author CFerg (Elite)
 */
public class Hypotenuse {

    /**
     *
     */
    public double hypotenuse;
    
    /**
     *
     */
    public Hypotenuse(){
        this.hypotenuse = 0.0;
    }
    
    /**
     *
     * @param a
     * @param o
     */
    public Hypotenuse(Adjacent a, Opposite o){
        this.hypotenuse = new SquareRoot((a.adjacent * a.adjacent) + (o.opposite * o.opposite)).squareRoot;
    }
}