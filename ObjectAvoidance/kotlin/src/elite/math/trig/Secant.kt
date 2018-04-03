package elite.math.trig

import elite.math.trig.triangle.Adjacent
import elite.math.trig.triangle.Hypotenuse

/**
 *
 * @author CFerg (Elite)
 */
class Secant {

    /**
     *
     */
    var secant: Double = 0.toDouble()

    /**
     *
     * @param h
     * @param a
     */
    constructor(h: Hypotenuse, a: Adjacent) {
        this.secant = h.hypotenuse / a.adjacent
    }

    /**
     *
     * @param arcsec
     */
    constructor(arcsec: Arcsecant) {
        this.secant = 1 / arcsec.arcsecant
    }

    /**
     *
     * @param cos
     */
    constructor(cos: Cosine) {
        this.secant = 1 / cos.cosine
    }
}