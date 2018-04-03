package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Arctangent {

    /**
     *
     */
    public double arctangent;
    
    /**
     *
     * @param a
     * @param o
     */
    public Arctangent(Adjacent a, Opposite o){
        this.arctangent = (a.adjacent / o.opposite);
    }
    
    /**
     *
     * @param tan
     */
    public Arctangent(Tangent tan){
        this.arctangent = (1 / tan.tangent);
    }
    
    /**
     *
     * @param cot
     */
    public Arctangent(Cotangent cot){
        this.arctangent = cot.cotangent;
    }
}