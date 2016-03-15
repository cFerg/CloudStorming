package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Hypotenuse;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Arccosecant {

    public double arccosecant;
    
    public Arccosecant(Opposite o, Hypotenuse h){
        this.arccosecant = (o.opposite / h.hypotenuse);
    }
    
    public Arccosecant(Cosecant csc){
        this.arccosecant = (1 / csc.cosecant);
    }
    
    public Arccosecant(Sine sin){
        this.arccosecant = sin.sine;
    }
}