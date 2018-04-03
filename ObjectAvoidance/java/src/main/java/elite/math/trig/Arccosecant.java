package elite.math.trig;

import elite.math.trig.triangle.Hypotenuse;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Arccosecant {

    /**
     *
     */
    public double arccosecant;
    
    /**
     *
     * @param o
     * @param h
     */
    public Arccosecant(Opposite o, Hypotenuse h){
        this.arccosecant = (o.opposite / h.hypotenuse);
    }
    
    /**
     *
     * @param csc
     */
    public Arccosecant(Cosecant csc){
        this.arccosecant = (1 / csc.cosecant);
    }
    
    /**
     *
     * @param sin
     */
    public Arccosecant(Sine sin){
        this.arccosecant = sin.sine;
    }
}