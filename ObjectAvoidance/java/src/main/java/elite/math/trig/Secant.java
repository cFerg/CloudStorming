package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Hypotenuse;

/**
 *
 * @author CFerg (Elite)
 */
public class Secant {

    /**
     *
     */
    public double secant;
    
    /**
     *
     * @param h
     * @param a
     */
    public Secant(Hypotenuse h, Adjacent a){
        this.secant = (h.hypotenuse / a.adjacent);
    }
    
    /**
     *
     * @param arcsec
     */
    public Secant(Arcsecant arcsec){
        this.secant = (1 / arcsec.arcsecant);
    }
    
    /**
     *
     * @param cos
     */
    public Secant(Cosine cos){
        this.secant = (1 / cos.cosine);
    }
}