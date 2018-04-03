package elite.math.angle;

/**
 *
 * @author CFerg (Elite)
 */
public class MilliArcSecond {

    double milliSecond;
    
    /**
     *
     */
    public MilliArcSecond(){
        this.milliSecond = (((1/60)/60)/1000);
    }
    
    /**
     *
     * @param a
     */
    public MilliArcSecond(Degree a){
        this.milliSecond = ((a.degree/3600)/1000);
    }
    
    /**
     *
     * @param a
     */
    public MilliArcSecond(ArcMinute a){
        this.milliSecond = ((a.minute/60)/1000);
    }
    
    /**
     *
     * @param a
     */
    public MilliArcSecond(ArcSecond a){
        this.milliSecond = (a.second/1000);
    }
    
    /**
     *
     * @param a
     */
    public MilliArcSecond(MicroArcSecond a){
        this.milliSecond = (a.microSecond*1000);
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
    public ArcMinute toMinute(){
        return new ArcMinute(this);
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
    public MicroArcSecond toMicroSecond(){
        return new MicroArcSecond(this);
    }
}