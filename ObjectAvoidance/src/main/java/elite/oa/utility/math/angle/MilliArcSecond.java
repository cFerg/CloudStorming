package elite.oa.utility.math.angle;

public class MilliArcSecond {

    double milliSecond;
    
    public MilliArcSecond(){
        this.milliSecond = (((1/60)/60)/1000);
    }
    
    public MilliArcSecond(Degree a){
        this.milliSecond = ((a.degree/3600)/1000);
    }
    
    public MilliArcSecond(ArcMinute a){
        this.milliSecond = ((a.minute/60)/1000);
    }
    
    public MilliArcSecond(ArcSecond a){
        this.milliSecond = (a.second/1000);
    }
    
    public MilliArcSecond(MicroArcSecond a){
        this.milliSecond = (a.microSecond*1000);
    }
    
    public Degree toDegree(){
        return new Degree(this);
    }
    
    public ArcMinute toMinute(){
        return new ArcMinute(this);
    }
    
    public ArcSecond toSecond(){
        return new ArcSecond(this);
    }
    
    public MicroArcSecond toMicroSecond(){
        return new MicroArcSecond(this);
    }
}