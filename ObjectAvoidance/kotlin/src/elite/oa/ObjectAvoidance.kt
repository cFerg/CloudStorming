package elite.oa

import elite.utility.Direction
import elite.utility.Distance
import elite.utility.Shape
import elite.utility.Speed
import elite.utility.Time
import elite.utility.Temperature
import elite.utility.GridPoint
import elite.utility.Size

/**
 *
 * @author CFerg (Elite)
 */
class ObjectAvoidance {

    internal var time: Time? = null
    internal var speed: Speed? = null
    internal var distance: Distance? = null
    internal var size: Size? = null
    internal var shape: Shape? = null
    internal var grid: GridPoint? = null //X | Y | Z
    internal var direction: Direction? = null
    internal var temp: Temperature? = null

    /**
     *
     */
    fun getDirection() {
        Math.atan((7 / 3).toDouble())
    }

    //sine = opposite / hypotenuse
    //cosine = adjacent / hypotenuse
    //tangent = opposite / adjacent

    /**
     *
     */

    fun relativePosition() {

    }

}