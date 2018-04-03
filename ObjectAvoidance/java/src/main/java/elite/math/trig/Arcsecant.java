package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Hypotenuse;

/**
 *
 * @author CFerg (Elite)
 */
public class Arcsecant {

    /**
     *
     */
    public double arcsecant;
    
    /**
     *
     * @param a
     * @param h
     */
    public Arcsecant(Adjacent a, Hypotenuse h){
        this.arcsecant = (a.adjacent / h.hypotenuse);
    }
    
    /**
     *
     * @param sec
     */
    public Arcsecant(Secant sec){
        this.arcsecant = (1 / sec.secant);
    }
    
    /**
     *
     * @param cos
     */
    public Arcsecant(Cosine cos){
        this.arcsecant = cos.cosine;
    }
}