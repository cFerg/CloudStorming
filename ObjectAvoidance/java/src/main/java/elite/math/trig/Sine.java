package elite.math.trig;

import elite.math.trig.triangle.Hypotenuse;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Sine {
    
    /**
     *
     */
    public double sine;
    
    /**
     *
     * @param o
     * @param h
     */
    public Sine(Opposite o, Hypotenuse h){
        this.sine = (o.opposite / h.hypotenuse);
    }
    
    /**
     *
     * @param arcsin
     */
    public Sine(Arcsine arcsin){
        this.sine = (1 / arcsin.arcsine);
    }
    
    /**
     *
     * @param csc
     */
    public Sine(Cosecant csc){
        this.sine = (1 / csc.cosecant);
    }
    
    /**
     *
     * @return
     */
    public Cosecant toCosecant(){
        return new Cosecant(this);
    }
    
    /**
     *
     * @return
     */
    public Arcsine toArcsine(){
        return new Arcsine(this);
    }
}