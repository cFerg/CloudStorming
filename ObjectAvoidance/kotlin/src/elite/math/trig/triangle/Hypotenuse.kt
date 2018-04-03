package elite.math.trig.triangle

import elite.math.SquareRoot

/**
 *
 * @author CFerg (Elite)
 */
class Hypotenuse {

    /**
     *
     */
    var hypotenuse: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.hypotenuse = 0.0
    }

    /**
     *
     * @param a
     * @param o
     */
    constructor(a: Adjacent, o: Opposite) {
        this.hypotenuse = SquareRoot(a.adjacent * a.adjacent + o.opposite * o.opposite).squareRoot
    }
}