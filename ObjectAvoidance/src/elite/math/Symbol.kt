package elite.math

/**
 *
 * @author CFerg (Elite)
 */
class Symbol {
    enum class Symbols private constructor(private val symbol: String) {
        CDF("F(x)"),
        PDF("f(x)"),
        SUMMATION("∑");

        fun symbol(): String {
            return this.symbol
        }
    }
}
