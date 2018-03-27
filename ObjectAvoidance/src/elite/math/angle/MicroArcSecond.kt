package elite.math.angle

/**
 *
 * @author CFerg (Elite)
 */
class MicroArcSecond {

    internal var microSecond: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.microSecond = (1 / 60 / 60 / 1000 / 1000).toDouble()
    }

    /**
     *
     * @param a
     */
    constructor(a: Degree) {
        this.microSecond = a.degree / 3600 / 1000 / 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcMinute) {
        this.microSecond = a.minute / 60 / 1000 / 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcSecond) {
        this.microSecond = a.second * 1000 * 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: MilliArcSecond) {
        this.microSecond = a.milliSecond * 1000
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
    fun toMilliSecond(): MilliArcSecond {
        return MilliArcSecond(this)
    }
}