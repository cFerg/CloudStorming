package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Adjacent;
import elite.oa.utility.math.trig.triangle.Hypotenuse;

public class Arcsecant {

    public double arcsecant;
    
    public Arcsecant(Adjacent a, Hypotenuse h){
        this.arcsecant = (a.adjacent / h.hypotenuse);
    }
    
    public Arcsecant(Secant sec){
        this.arcsecant = (1 / sec.secant);
    }
    
    public Arcsecant(Cosine cos){
        this.arcsecant = cos.cosine;
    }
}