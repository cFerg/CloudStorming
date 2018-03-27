package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Arccotangent {

    /**
     *
     */
    var arccotangent: Double = 0.toDouble()

    /**
     *
     * @param o
     * @param a
     */
    constructor(o: Opposite, a: Adjacent) {
        this.arccotangent = o.opposite / a.adjacent
    }

    /**
     *
     * @param cot
     */
    constructor(cot: Cotangent) {
        this.arccotangent = 1 / cot.cotangent
    }

    /**
     *
     * @param tan
     */
    constructor(tan: Tangent) {
        this.arccotangent = tan.tangent
    }
}