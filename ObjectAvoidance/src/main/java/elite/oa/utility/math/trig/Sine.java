package elite.oa.utility.math.trig;

import elite.oa.utility.math.trig.triangle.Hypotenuse;
import elite.oa.utility.math.trig.triangle.Opposite;

public class Sine {
    
    public double sine;
    
    public Sine(Opposite o, Hypotenuse h){
        this.sine = (o.opposite / h.hypotenuse);
    }
    
    public Sine(Cosecant csc){
        this.sine = (1 / csc.cosecant);
    }
    
    public Cosecant toCosecant(){
        return new Cosecant(this);
    }
}