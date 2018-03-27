package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Tangent {

    /**
     *
     */
    var tangent: Double = 0.toDouble()

    /**
     *
     * @param o
     * @param a
     */
    constructor(o: Opposite, a: Adjacent) {
        this.tangent = o.opposite / a.adjacent
    }

    /**
     *
     * @param arctan
     */
    constructor(arctan: Arctangent) {
        this.tangent = 1 / arctan.arctangent
    }

    /**
     *
     * @param cot
     */
    constructor(cot: Cotangent) {
        this.tangent = 1 / cot.cotangent
    }
}