package elite.oa.road

/**
 *
 * @author CFerg (Elite)
 */
enum class Lanes {

    /**
     *
     */
    SLOW, //Default 'right' lane on u.s. highway

    /**
     *
     */
    PASSING, //Default 'left' lane on u.s. highway

    /**
     *
     */
    ACCELERATION, //lane created to the right, for usage with an 'on-ramp'

    /**
     *
     */
    DECELERATION, //lane created to the right, for usage with an 'off-ramp'

    /**
     *
     */
    HOV, //lane used for high-occupancy-vehicles

    /**
     *
     */
    TOLL, //lane used to take a toll-road

    /**
     *
     */
    BIKE, //lane used exclusively for biking

    /**
     *
     */
    MOTORCYCLE, //lane used exclusively for motorcycles

    /**
     *
     */
    BUS, //lanes reserved for buses, trolleys, taxis, bicycles, and motorcycles

    /**
     *
     */
    TRAM, //lanes reserved for buses, trams, and taxis

    /**
     *
     */
    TRUCKWAY, //lanes reserved for long trucks (ie. 96 foot)

    /**
     *
     */
    PARKING, //parallel parking areas

    /**
     *
     */
    FIRE, //area for ambulance and firefighting equipment

    /**
     *
     */
    LOADING, //reserved for freight

    /**
     *
     */
    SHOULDER, //areas on the side of the roads

    /**
     *
     */
    CENTER //areas to allow driving across the opposite road to a destination
}