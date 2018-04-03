package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Hypotenuse

/**
 *
 * @author CFerg (Elite)
 */
class Arcsecant {

    /**
     *
     */
    var arcsecant: Double = 0.toDouble()

    /**
     *
     * @param a
     * @param h
     */
    constructor(a: Adjacent, h: Hypotenuse) {
        this.arcsecant = a.adjacent / h.hypotenuse
    }

    /**
     *
     * @param sec
     */
    constructor(sec: Secant) {
        this.arcsecant = 1 / sec.secant
    }

    /**
     *
     * @param cos
     */
    constructor(cos: Cosine) {
        this.arcsecant = cos.cosine
    }
}