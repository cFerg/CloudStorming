package elite.math.trig;

import elite.math.trig.triangle.Hypotenuse;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Arcsine {

    /**
     *
     */
    public double arcsine;
    
    /**
     *
     * @param h
     * @param o
     */
    public Arcsine(Hypotenuse h, Opposite o){
        this.arcsine = (h.hypotenuse / o.opposite);
    }
    
    /**
     *
     * @param sin
     */
    public Arcsine(Sine sin){
        this.arcsine = (1 / sin.sine);
    }
    
    /**
     *
     * @param csc
     */
    public Arcsine(Cosecant csc){
        this.arcsine = csc.cosecant;
    }
}