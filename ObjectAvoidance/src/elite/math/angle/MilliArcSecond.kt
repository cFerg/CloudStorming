package elite.math.angle

/**
 *
 * @author CFerg (Elite)
 */
class MilliArcSecond {

    internal var milliSecond: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.milliSecond = (1 / 60 / 60 / 1000).toDouble()
    }

    /**
     *
     * @param a
     */
    constructor(a: Degree) {
        this.milliSecond = a.degree / 3600 / 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcMinute) {
        this.milliSecond = a.minute / 60 / 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcSecond) {
        this.milliSecond = a.second / 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: MicroArcSecond) {
        this.milliSecond = a.microSecond * 1000
    }

    /**
     *
     * @return
     */
    fun toDegree(): Degree {
        return Degree(this)
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
    fun toMicroSecond(): MicroArcSecond {
        return MicroArcSecond(this)
    }
}