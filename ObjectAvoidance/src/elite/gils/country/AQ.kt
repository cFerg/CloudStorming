package elite.gils.country

/**
 * Continent: (Name)
 * Country: (Name)
 */

enum class AQ private constructor(
        //Leave the code below alone (unless optimizing)

        private val name: String) {
    //List of State/Province names (Use 2 Letter/Number Combination codes)

    /**
     * Name:
     */
    AA("Example"),

    /**
     * Name:
     */
    AB("Example"),

    /**
     * Name:
     */
    AC("Example");

    fun getName(state: AQ): String {
        return state.name
    }
}