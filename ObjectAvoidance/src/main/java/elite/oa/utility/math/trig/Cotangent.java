package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Cotangent {

    public double cotangent;
    
    public Cotangent(Adjacent a, Opposite o){
        this.cotangent = (a.adjacent / o.opposite);
    }
    
    public Cotangent(Arccotangent arccot){
        this.cotangent = (1 / arccot.arccotangent);
    }
    
    public Cotangent(Tangent tan){
        this.cotangent = (1 / tan.tangent);
    }
}