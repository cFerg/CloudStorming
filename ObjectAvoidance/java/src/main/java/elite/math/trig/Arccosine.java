package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Hypotenuse;

/**
 *
 * @author CFerg (Elite)
 */
public class Arccosine {

    /**
     *
     */
    public double arccosine;
    
    /**
     *
     * @param h
     * @param a
     */
    public Arccosine(Hypotenuse h, Adjacent a){
        this.arccosine = (h.hypotenuse / a.adjacent);
    }
    
    /**
     *
     * @param cos
     */
    public Arccosine(Cosine cos){
        this.arccosine = (1 / cos.cosine);
    }
    
    /**
     *
     * @param sec
     */
    public Arccosine(Secant sec){
        this.arccosine = sec.secant;
    }
}