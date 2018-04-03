package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Arccotangent {

    /**
     *
     */
    public double arccotangent;
    
    /**
     *
     * @param o
     * @param a
     */
    public Arccotangent(Opposite o, Adjacent a){
        this.arccotangent = (o.opposite / a.adjacent);
    }
    
    /**
     *
     * @param cot
     */
    public Arccotangent(Cotangent cot){
        this.arccotangent = (1 / cot.cotangent);
    }
    
    /**
     *
     * @param tan
     */
    public Arccotangent(Tangent tan){
        this.arccotangent = tan.tangent;
    }
}