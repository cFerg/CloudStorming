package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Arctangent {

    public double arctangent;
    
    public Arctangent(Adjacent a, Opposite o){
        this.arctangent = (a.adjacent / o.opposite);
    }
    
    public Arctangent(Tangent tan){
        this.arctangent = (1 / tan.tangent);
    }
    
    public Arctangent(Cotangent cot){
        this.arctangent = cot.cotangent;
    }
}