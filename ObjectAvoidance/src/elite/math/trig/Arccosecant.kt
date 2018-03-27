package elite.math.trig

import elite.math.trig.triangle.Hypotenuse
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Arccosecant {

    /**
     *
     */
    var arccosecant: Double = 0.toDouble()

    /**
     *
     * @param o
     * @param h
     */
    constructor(o: Opposite, h: Hypotenuse) {
        this.arccosecant = o.opposite / h.hypotenuse
    }

    /**
     *
     * @param csc
     */
    constructor(csc: Cosecant) {
        this.arccosecant = 1 / csc.cosecant
    }

    /**
     *
     * @param sin
     */
    constructor(sin: Sine) {
        this.arccosecant = sin.sine
    }
}