package elite.math.angle

/**
 *
 * @author CFerg (Elite)
 */
class ArcSecond {

    internal var second: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.second = (1 / 60 / 60).toDouble()
    }

    /**
     *
     * @param a
     */
    constructor(a: Degree) {
        this.second = a.degree / 3600
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcMinute) {
        this.second = a.minute / 60
    }

    /**
     *
     * @param a
     */
    constructor(a: MilliArcSecond) {
        this.second = a.milliSecond * 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: MicroArcSecond) {
        this.second = a.microSecond * 1000 * 1000
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