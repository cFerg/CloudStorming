package elite.math.trig;

import elite.math.trig.triangle.Hypotenuse;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Cosecant {

    /**
     *
     */
    public double cosecant;
    
    /**
     *
     * @param h
     * @param o
     */
    public Cosecant(Hypotenuse h, Opposite o){
        this.cosecant = (h.hypotenuse / o.opposite);
    }
    
    /**
     *
     * @param arccos
     */
    public Cosecant(Arccosecant arccos){
        this.cosecant = (1 / arccos.arccosecant);
    }
    
    /**
     *
     * @param sin
     */
    public Cosecant(Sine sin){
        this.cosecant = (1 / sin.sine);
    }
}