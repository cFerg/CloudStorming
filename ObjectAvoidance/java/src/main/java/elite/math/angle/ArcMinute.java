package elite.math.angle;

/**
 *
 * @author CFerg (Elite)
 */
public class ArcMinute{
    
    double minute;
    
    /**
     *
     */
    public ArcMinute(){
        minute = (1/60);
    }
    
    /**
     *
     * @param a
     */
    public ArcMinute(Degree a){
        this.minute = (a.degree/60);
    }
    
    /**
     *
     * @param a
     */
    public ArcMinute(ArcSecond a){
        this.minute = (a.second*60);
    }
    
    /**
     *
     * @param a
     */
    public ArcMinute(MilliArcSecond a){
        this.minute = ((a.milliSecond*60)*1000);
    }
    
    /**
     *
     * @param a
     */
    public ArcMinute(MicroArcSecond a){
        this.minute = (((a.microSecond*60)*1000)*1000);
    }
    
    /**
     *
     * @return
     */
    public Degree toDegree(){
        return new Degree(this);
    }
    
    /**
     *
     * @return
     */
    public ArcSecond toSecond(){
        return new ArcSecond(this);
    }
    
    /**
     *
     * @return
     */
    public MilliArcSecond toMilliSecond(){
        return new MilliArcSecond(this);
    }
    
    /**
     *
     * @return
     */
    public MicroArcSecond toMicroSecond(){
        return new MicroArcSecond(this);
    }
}