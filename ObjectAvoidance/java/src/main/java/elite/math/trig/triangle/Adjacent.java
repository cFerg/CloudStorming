package elite.math.trig.triangle;

import elite.math.SquareRoot;

/**
 *
 * @author CFerg (Elite)
 */
public class Adjacent {

    /**
     *
     */
    public double adjacent;
    
    /**
     *
     */
    public Adjacent(){
        this.adjacent = 0.0;
    }
    
    /**
     *
     * @param h
     * @param o
     */
    public Adjacent(Hypotenuse h, Opposite o){
        this.adjacent = new SquareRoot((h.hypotenuse * h.hypotenuse) - (o.opposite * o.opposite)).squareRoot;
    }
}