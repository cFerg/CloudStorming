package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Hypotenuse;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Arcsine {

    public double arcsine;
    
    public Arcsine(Hypotenuse h, Opposite o){
        this.arcsine = (h.hypotenuse / o.opposite);
    }
    
    public Arcsine(Sine sin){
        this.arcsine = (1 / sin.sine);
    }
    
    public Arcsine(Cosecant csc){
        this.arcsine = csc.cosecant;
    }
}