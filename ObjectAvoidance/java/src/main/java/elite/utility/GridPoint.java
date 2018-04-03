package elite.utility;

/**
 *
 * @author CFerg (Elite)
 */
public class GridPoint {

    double x, y, z;
    
    /**
     *
     */
    public GridPoint(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }
    
    /**
     *
     * @param x
     * @param y
     * @param z
     */
    public GridPoint(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     *
     * @param x
     */
    public void setX(double x){
        this.x = x;
    }
    
    /**
     *
     * @param y
     */
    public void setY(double y){
        this.y = y;
    }
    
    /**
     *
     * @param z
     */
    public void setZ(double z){
        this.z = z;
    }
}