package elite.math.trig.triangle

import elite.math.SquareRoot

/**
 *
 * @author CFerg (Elite)
 */
class Adjacent {

    /**
     *
     */
    var adjacent: Double = 0.toDouble()

    /**
     *
     */
    constructor() {
        this.adjacent = 0.0
    }

    /**
     *
     * @param h
     * @param o
     */
    constructor(h: Hypotenuse, o: Opposite) {
        this.adjacent = SquareRoot(h.hypotenuse * h.hypotenuse - o.opposite * o.opposite).squareRoot
    }
}