package elite.math.trig

import elite.math.trig.triangle.Hypotenuse
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Arcsine {

    /**
     *
     */
    var arcsine: Double = 0.toDouble()

    /**
     *
     * @param h
     * @param o
     */
    constructor(h: Hypotenuse, o: Opposite) {
        this.arcsine = h.hypotenuse / o.opposite
    }

    /**
     *
     * @param sin
     */
    constructor(sin: Sine) {
        this.arcsine = 1 / sin.sine
    }

    /**
     *
     * @param csc
     */
    constructor(csc: Cosecant) {
        this.arcsine = csc.cosecant
    }
}