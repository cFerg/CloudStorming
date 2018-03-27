package elite.math.angle

/**
 *
 * @author CFerg (Elite)
 */
class Degree {

    internal var degree: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.degree = (1 / 360).toDouble()
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcMinute) {
        this.degree = a.minute * 60
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcSecond) {
        this.degree = a.second * 3600
    }

    /**
     *
     * @param a
     */
    constructor(a: MilliArcSecond) {
        this.degree = a.milliSecond * 3600 * 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: MicroArcSecond) {
        this.degree = a.microSecond * 3600 * 1000 * 1000
    }

    /**
     *
     * @return
     */
    fun toMinute(): ArcMinute {
        return ArcMinute(this)
    }

    /**
     *
     * @return
     */
    fun toSecond(): ArcSecond {
        return ArcSecond(this)
    }

    /**
     *
     * @return
     */
    fun toMilliSecond(): MilliArcSecond {
        return MilliArcSecond(this)
    }

    /**
     *
     * @return
     */
    fun toMicroSecond(): MicroArcSecond {
        return MicroArcSecond(this)
    }
}