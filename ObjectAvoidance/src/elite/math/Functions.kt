package elite.math

import java.lang.reflect.Array

/**
 *
 * @author CFerg (Elite)
 */
class Functions {

    /**
     * Returns a square of an int number
     *
     * @param n The number to be squared
     * @return
     */
    fun square(n: Int): Int {
        return n * n
    }

    /**
     * Returns a square of a byte number
     *
     * @param n The number to be squared
     * @return
     */
    fun square(n: Byte): Int {
        return n * n
    }

    /**
     * Returns a square of a short number
     *
     * @param n The number to be squared
     * @return
     */
    fun square(n: Short): Int {
        return n * n
    }

    /**
     * Returns a square of a double number
     *
     * @param n The number to be squared
     * @return
     */
    fun square(n: Double): Double {
        return n * n

    }

    /**
     * Returns a square of a float number
     *
     * @param n The number to be squared
     * @return
     */
    fun square(n: Float): Float {
        return n * n
    }

    /**
     * Returns a preset square of a single-digit number
     *
     * @param n The number to be squared
     * @return
     */
    private fun getSquare(n: Int): Int {
        when (n) {
            0 -> return 0
            1, -1 -> return 1
            2, -2 -> return 4
            3, -3 -> return 9
            4, -4 -> return 16
            5, -5 -> return 25
            6, -6 -> return 36
            7, -7 -> return 49
            8, -8 -> return 64
            9, -9 -> return 81
            else -> return square(n)
        }
    }

    /**
     *
     * @param n
     * @return
     */
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

    //====================================
    //Square Root
    //====================================

    /**
     *
     * @param n
     * @return
     */
    fun squareRoot(n: Double): Double {
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

        return value
    }

    /**
     *
     * @param n
     * @return
     */
    fun getBinaryValue(n: Byte): Int {

        val bit = n.toString().toCharArray()

        var value = 0

        var currentMultiplier = 1

        val l = 1

        for (I in bit.size downTo 1) {
            if (Array.get(bit, I) == l) {
                value += currentMultiplier
            }

            currentMultiplier = currentMultiplier * 2
        }

        return value
    }
}