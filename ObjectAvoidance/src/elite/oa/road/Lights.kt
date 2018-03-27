package elite.oa.road

/**
 *
 * @author CFerg (Elite)
 */
enum class Lights {
    /**
     * Allow traffic to go through the traffic light.
     * If 'Yield On Green' sign is visible - Be wary of oncoming traffic while turning.
     */
    TRAFFIC_GREEN_SOLID,

    /**
     * Allow traffic to go across the opposite traffic direction
     * Solid arrow over-rides yield sign of oncoming traffic.
     */
    TRAFFIC_GREEN_ARROW,

    /**
     * Allow traffic under/near the traffic light to go through.
     * Traffic in the distance needs to prepare to stop.
     */
    TRAFFIC_YELLOW_SOLID,

    /**
     * Allow traffic under/near the traffic light go through 'while' yielding to oncoming traffic in the other 3 possible directions.
     * Traffic waiting first usually has right of way
     */
    TRAFFIC_YELLOW_FLASHING,

    /**
     * Allow traffic under/near the traffic light go across the opposite traffic direction
     * Traffic in the distance needs to prepare to stop.
     */
    TRAFFIC_YELLOW_ARROW,

    /**
     *
     */
    TRAFFIC_RED_SOLID,

    /**
     *
     */
    TRAFFIC_RED_ARROW,

    /**
     *
     */
    VEHICLE_REAR_BOTH_SOLID,

    /**
     *
     */
    VEHICLE_REAR_BOTH_FLASH,

    /**
     *
     */
    VEHICLE_REAR_RIGHT_SOLID,

    /**
     *
     */
    VEHICLE_REAR_RIGHT_FLASH,

    /**
     *
     */
    VEHICLE_REAR_LEFT_SOLID,

    /**
     *
     */
    VEHICLE_REAR_LEFT_FLASH,

    /**
     *
     */
    VEHICLE_FRONT_BOTH_FLASH,

    /**
     *
     */
    VEHICLE_FRONT_RIGHT_FLASH,

    /**
     *
     */
    VEHICLE_FRONT_LEFT_FLASH
}