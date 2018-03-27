package elite.math.angle

/**
 *
 * @author CFerg (Elite)
 */
class ArcMinute {

    internal var minute: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        minute = (1 / 60).toDouble()
    }

    /**
     *
     * @param a
     */
    constructor(a: Degree) {
        this.minute = a.degree / 60
    }

    /**
     *
     * @param a
     */
    constructor(a: ArcSecond) {
        this.minute = a.second * 60
    }

    /**
     *
     * @param a
     */
    constructor(a: MilliArcSecond) {
        this.minute = a.milliSecond * 60 * 1000
    }

    /**
     *
     * @param a
     */
    constructor(a: MicroArcSecond) {
        this.minute = a.microSecond * 60 * 1000 * 1000
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