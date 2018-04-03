package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Tangent {

    /**
     *
     */
    public double tangent;
    
    /**
     *
     * @param o
     * @param a
     */
    public Tangent(Opposite o, Adjacent a){
        this.tangent = (o.opposite / a.adjacent);
    }
    
    /**
     *
     * @param arctan
     */
    public Tangent(Arctangent arctan){
        this.tangent = (1 / arctan.arctangent);
    }
    
    /**
     *
     * @param cot
     */
    public Tangent(Cotangent cot){
        this.tangent = (1 / cot.cotangent);
    }
}