package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Cotangent {

    /**
     *
     */
    var cotangent: Double = 0.toDouble()

    /**
     *
     * @param a
     * @param o
     */
    constructor(a: Adjacent, o: Opposite) {
        this.cotangent = a.adjacent / o.opposite
    }

    /**
     *
     * @param arccot
     */
    constructor(arccot: Arccotangent) {
        this.cotangent = 1 / arccot.arccotangent
    }

    /**
     *
     * @param tan
     */
    constructor(tan: Tangent) {
        this.cotangent = 1 / tan.tangent
    }
}