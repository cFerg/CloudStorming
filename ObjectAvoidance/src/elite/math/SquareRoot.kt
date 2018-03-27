package elite.math

class SquareRoot(n: Double) {

    var squareRoot: Double = 0.toDouble()

    init {
        val value = 0.0
        val digits = getCount(n)


        //split number into pairs
        //if odd amount - do 1 then 2s
        //if even amount - do only 2s

        //see what pre-set square goes into the first pair without going over (highest is 81 - which is 9)

        //subtract square from first pair - get the remainder (ie. 2 - 1 ...1 is remainder)

        //add the next pair to the end of the remainder (ie. 1 & 89 = 189)

        //take the last number of the last used square and double it ... (ie. 1 -> 2 & 12 -> 14)

        //add a number after the last digit in the last modified square
        //the number used will be multiplied by that number (ie. 21 x 1 ... 22 x 2)
        //if all numbers go over - use 0 | you 'can' use bigger numbers than 9, but it's rare

        //repeat until no remainder

    }

    private fun getCount(n: Double): Int {
        var value = 0

        if (n >= 0) {

        } else if (n < 0) {
            val x = 0 - n

        } else {
            value = 0
        }//The value doesn't exist - we'll set the count to zero
        //The value is negative - make it positive so we can get the count

        return value
    }
}