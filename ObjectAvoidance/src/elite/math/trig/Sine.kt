package elite.math.trig

import elite.math.trig.triangle.Hypotenuse
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Sine {

    /**
     *
     */
    var sine: Double = 0.toDouble()

    /**
     *
     * @param o
     * @param h
     */
    constructor(o: Opposite, h: Hypotenuse) {
        this.sine = o.opposite / h.hypotenuse
    }

    /**
     *
     * @param arcsin
     */
    constructor(arcsin: Arcsine) {
        this.sine = 1 / arcsin.arcsine
    }

    /**
     *
     * @param csc
     */
    constructor(csc: Cosecant) {
        this.sine = 1 / csc.cosecant
    }

    /**
     *
     * @return
     */
    fun toCosecant(): Cosecant {
        return Cosecant(this)
    }

    /**
     *
     * @return
     */
    fun toArcsine(): Arcsine {
        return Arcsine(this)
    }
}