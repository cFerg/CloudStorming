package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Hypotenuse

/**
 *
 * @author CFerg (Elite)
 */
class Arccosine {

    /**
     *
     */
    var arccosine: Double = 0.toDouble()

    /**
     *
     * @param h
     * @param a
     */
    constructor(h: Hypotenuse, a: Adjacent) {
        this.arccosine = h.hypotenuse / a.adjacent
    }

    /**
     *
     * @param cos
     */
    constructor(cos: Cosine) {
        this.arccosine = 1 / cos.cosine
    }

    /**
     *
     * @param sec
     */
    constructor(sec: Secant) {
        this.arccosine = sec.secant
    }
}