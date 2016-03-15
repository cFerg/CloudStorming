package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Hypotenuse;

public class Cosine {
    
    public double cosine;
    
    public Cosine(Adjacent a, Hypotenuse h){
        this.cosine = (a.adjacent / h.hypotenuse);
    }
    
    public Cosine(Secant sec){
        this.cosine = (1 / sec.secant);
    }
}