package elite.gils.country

/**
 * Continent: (Name)
 * Country: (Name)
 */

enum class CY private constructor(
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

    fun getName(state: CY): String {
        return state.name
    }
}