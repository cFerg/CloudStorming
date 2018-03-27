package elite.math.trig.triangle

import elite.math.SquareRoot

/**
 *
 * @author CFerg (Elite)
 */
class Opposite {

    /**
     *
     */
    var opposite: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.opposite = 0.0
    }

    /**
     *
     * @param a
     * @param h
     */
    constructor(a: Adjacent, h: Hypotenuse) {
        this.opposite = SquareRoot(h.hypotenuse * h.hypotenuse - a.adjacent * a.adjacent).squareRoot
    }
}