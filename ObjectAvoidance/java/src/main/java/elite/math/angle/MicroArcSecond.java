package elite.math.angle;

/**
 *
 * @author CFerg (Elite)
 */
public class MicroArcSecond {

    double microSecond;
    
    /**
     *
     */
    public MicroArcSecond(){
        this.microSecond = ((((1/60)/60)/1000)/1000);
    }
    
    /**
     *
     * @param a
     */
    public MicroArcSecond(Degree a){
        this.microSecond = (((a.degree/3600)/1000)/1000);
    }
    
    /**
     *
     * @param a
     */
    public MicroArcSecond(ArcMinute a){
        this.microSecond = (((a.minute/60)/1000)/1000);
    }
    
    /**
     *
     * @param a
     */
    public MicroArcSecond(ArcSecond a){
        this.microSecond = ((a.second*1000)*1000);
    }
    
    /**
     *
     * @param a
     */
    public MicroArcSecond(MilliArcSecond a){
        this.microSecond = (a.milliSecond*1000);
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
    public MilliArcSecond toMilliSecond(){
        return new MilliArcSecond(this);
    }
}