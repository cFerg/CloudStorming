package elite.oa.utility.math.angle;

public class ArcMinute{
    
    double minute;
    
    public ArcMinute(){
        minute = (1/60);
    }
    
    public ArcMinute(Degree a){
        this.minute = (a.degree/60);
    }
    
    public ArcMinute(ArcSecond a){
        this.minute = (a.second*60);
    }
    
    public ArcMinute(MilliArcSecond a){
        this.minute = ((a.milliSecond*60)*1000);
    }
    
    public ArcMinute(MicroArcSecond a){
        this.minute = (((a.microSecond*60)*1000)*1000);
    }
    
    public Degree toDegree(){
        return new Degree(this);
    }
    
    public ArcSecond toSecond(){
        return new ArcSecond(this);
    }
    
    public MilliArcSecond toMilliSecond(){
        return new MilliArcSecond(this);
    }
    
    public MicroArcSecond toMicroSecond(){
        return new MicroArcSecond(this);
    }
}
