package elite.math.trig;

import elite.math.trig.triangle.Adjacent;
import elite.math.trig.triangle.Opposite;

/**
 *
 * @author CFerg (Elite)
 */
public class Cotangent {

    /**
     *
     */
    public double cotangent;
    
    /**
     *
     * @param a
     * @param o
     */
    public Cotangent(Adjacent a, Opposite o){
        this.cotangent = (a.adjacent / o.opposite);
    }
    
    /**
     *
     * @param arccot
     */
    public Cotangent(Arccotangent arccot){
        this.cotangent = (1 / arccot.arccotangent);
    }
    
    /**
     *
     * @param tan
     */
    public Cotangent(Tangent tan){
        this.cotangent = (1 / tan.tangent);
    }
}