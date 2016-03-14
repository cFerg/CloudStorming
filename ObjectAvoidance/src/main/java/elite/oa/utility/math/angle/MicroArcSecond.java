package elite.oa.utility.math.angle;

public class MicroArcSecond {

    double microSecond;
    
    public MicroArcSecond(){
        this.microSecond = ((((1/60)/60)/1000)/1000);
    }
    
    public MicroArcSecond(Degree a){
        this.microSecond = (((a.degree/3600)/1000)/1000);
    }
    
    public MicroArcSecond(ArcMinute a){
        this.microSecond = (((a.minute/60)/1000)/1000);
    }
    
    public MicroArcSecond(ArcSecond a){
        this.microSecond = ((a.second*1000)*1000);
    }
    
    public MicroArcSecond(MilliArcSecond a){
        this.microSecond = (a.milliSecond*1000);
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
    
    public MilliArcSecond toMilliSecond(){
        return new MilliArcSecond(this);
    }
}