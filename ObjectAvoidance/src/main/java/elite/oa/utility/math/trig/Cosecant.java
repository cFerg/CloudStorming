package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Hypotenuse;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Cosecant {

    public double cosecant;
    
    public Cosecant(Hypotenuse h, Opposite o){
        this.cosecant = (h.hypotenuse / o.opposite);
    }
    
    public Cosecant(Sine sin){
        this.cosecant = (1 / sin.sine);
    }
}