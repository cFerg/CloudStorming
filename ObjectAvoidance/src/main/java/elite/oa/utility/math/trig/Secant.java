package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Hypotenuse;

public class Secant {

    public double secant;
    
    public Secant(Hypotenuse h, Adjacent a){
        this.secant = (h.hypotenuse / a.adjacent);
    }
    
    public Secant(Cosine cos){
        this.secant = (1 / cos.cosine);
    }
}