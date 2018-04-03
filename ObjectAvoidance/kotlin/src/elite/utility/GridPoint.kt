package elite.utility

/**
 *
 * @author CFerg (Elite)
 */
class GridPoint {

    internal var x: Double = 0.toDouble()
    internal var y: Double = 0.toDouble()
    internal var z: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.x = 0.0
        this.y = 0.0
        this.z = 0.0
    }

    /**
     *
     * @param x
     * @param y
     * @param z
     */
    constructor(x: Double, y: Double, z: Double) {
        this.x = x
        this.y = y
        this.z = z
    }

    /**
     *
     * @param x
     */
    fun setX(x: Double) {
        this.x = x
    }

    /**
     *
     * @param y
     */
    fun setY(y: Double) {
        this.y = y
    }

    /**
     *
     * @param z
     */
    fun setZ(z: Double) {
        this.z = z
    }
}