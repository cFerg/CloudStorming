package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Tangent {

    public double tangent;
    
    public Tangent(Opposite o, Adjacent a){
        this.tangent = (o.opposite / a.adjacent);
    }
    
    public Tangent(Cotangent cot){
        this.tangent = (1 / cot.cotangent);
    }
}