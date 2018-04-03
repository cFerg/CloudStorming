package elite.math.angle;

/**
 *
 * @author CFerg (Elite)
 */
public class Degree {

    double degree;
    
    /**
     *
     */
    public Degree(){
        this.degree = (1/360);
    }
    
    /**
     *
     * @param a
     */
    public Degree(ArcMinute a){
        this.degree = (a.minute*60);
    }
    
    /**
     *
     * @param a
     */
    public Degree(ArcSecond a){
        this.degree = (a.second*3600);
    }
    
    /**
     *
     * @param a
     */
    public Degree(MilliArcSecond a){
        this.degree = ((a.milliSecond*3600)*1000);
    }
    
    /**
     *
     * @param a
     */
    public Degree(MicroArcSecond a){
        this.degree = (((a.microSecond*3600)*1000)*1000);
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
    
    /**
     *
     * @return
     */
    public MicroArcSecond toMicroSecond(){
        return new MicroArcSecond(this);
    }
}