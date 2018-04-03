package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Hypotenuse

/**
 *
 * @author CFerg (Elite)
 */
class Cosine {

    /**
     *
     */
    var cosine: Double = 0.toDouble()

    /**
     *
     * @param a
     * @param h
     */
    constructor(a: Adjacent, h: Hypotenuse) {
        this.cosine = a.adjacent / h.hypotenuse
    }

    /**
     *
     * @param arccos
     */
    constructor(arccos: Arccosine) {
        this.cosine = 1 / arccos.arccosine
    }

    /**
     *
     * @param sec
     */
    constructor(sec: Secant) {
        this.cosine = 1 / sec.secant
    }
}