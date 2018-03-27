package elite.math.trig

import elite.math.trig.triangle.Hypotenuse
import elite.math.trig.triangle.Opposite

/**
 *
 * @author CFerg (Elite)
 */
class Cosecant {

    /**
     *
     */
    var cosecant: Double = 0.toDouble()

    /**
     *
     * @param h
     * @param o
     */
    constructor(h: Hypotenuse, o: Opposite) {
        this.cosecant = h.hypotenuse / o.opposite
    }

    /**
     *
     * @param arccos
     */
    constructor(arccos: Arccosecant) {
        this.cosecant = 1 / arccos.arccosecant
    }

    /**
     *
     * @param sin
     */
    constructor(sin: Sine) {
        this.cosecant = 1 / sin.sine
    }
}