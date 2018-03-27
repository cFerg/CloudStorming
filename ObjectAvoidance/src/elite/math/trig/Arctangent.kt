package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Arctangent {

    /**
     *
     */
    var arctangent: Double = 0.toDouble()

    /**
     *
     * @param a
     * @param o
     */
    constructor(a: Adjacent, o: Opposite) {
        this.arctangent = a.adjacent / o.opposite
    }

    /**
     *
     * @param tan
     */
    constructor(tan: Tangent) {
        this.arctangent = 1 / tan.tangent
    }

    /**
     *
     * @param cot
     */
    constructor(cot: Cotangent) {
        this.arctangent = cot.cotangent
    }
}