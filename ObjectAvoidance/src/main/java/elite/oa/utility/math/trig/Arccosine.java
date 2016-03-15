package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Hypotenuse;

public class Arccosine {

    public double arccosine;
    
    public Arccosine(Hypotenuse h, Adjacent a){
        this.arccosine = (h.hypotenuse / a.adjacent);
    }
    
    public Arccosine(Cosine cos){
        this.arccosine = (1 / cos.cosine);
    }
    
    public Arccosine(Secant sec){
        this.arccosine = sec.secant;
    }
}