package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Hypotenuse;

/**
 *
 * @author CFerg (Elite)
 */
public class Cosine {
    
    /**
     *
     */
    public double cosine;
    
    /**
     *
     * @param a
     * @param h
     */
    public Cosine(Adjacent a, Hypotenuse h){
        this.cosine = (a.adjacent / h.hypotenuse);
    }
    
    /**
     *
     * @param arccos
     */
    public Cosine(Arccosine arccos){
        this.cosine = (1 / arccos.arccosine);
    }
    
    /**
     *
     * @param sec
     */
    public Cosine(Secant sec){
        this.cosine = (1 / sec.secant);
    }
}