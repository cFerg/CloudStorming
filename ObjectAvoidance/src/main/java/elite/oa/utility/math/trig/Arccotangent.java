package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Arccotangent {

    public double arccotangent;
    
    public Arccotangent(Opposite o, Adjacent a){
        this.arccotangent = (o.opposite / a.adjacent);
    }
    
    public Arccotangent(Cotangent cot){
        this.arccotangent = (1 / cot.cotangent);
    }
    
    public Arccotangent(Tangent tan){
        this.arccotangent = tan.tangent;
    }
}