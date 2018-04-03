package elite.math.angle;

/**
 *
 * @author CFerg (Elite)
 */
public class ArcSecond {

    double second;
    
    /**
     *
     */
    public ArcSecond(){
        this.second = ((1/60)/60);
    }
    
    /**
     *
     * @param a
     */
    public ArcSecond(Degree a){
        this.second = (a.degree/3600);
    }
    
    /**
     *
     * @param a
     */
    public ArcSecond(ArcMinute a){
        this.second = (a.minute/60);
    }
    
    /**
     *
     * @param a
     */
    public ArcSecond(MilliArcSecond a){
        this.second = (a.milliSecond*1000);
    }
    
    /**
     *
     * @param a
     */
    public ArcSecond(MicroArcSecond a){
        this.second = ((a.microSecond*1000)*1000);
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