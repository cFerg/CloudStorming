package elite.gils

class Base {

    val bits: Int
        get() = 0

    val value: Int
        get() = 0

    fun getBaseValue(c: Char): Short {
        when (c) {
            0 -> return 0
            1 -> return 1
            2 -> return 2
            3 -> return 3
            4 -> return 4
            5 -> return 5
            6 -> return 6
            7 -> return 7
            8 -> return 8
            9 -> return 9
            'a', 'A' -> return 10
            'b', 'B' -> return 11
            'c', 'C' -> return 12
            'd', 'D' -> return 13
            'e', 'E' -> return 14
            'f', 'F' -> return 15
            'g', 'G' -> return 16
            'h', 'H' -> return 17
            'i', 'I' -> return 18
            'j', 'J' -> return 19
            'k', 'K' -> return 20
            'l', 'L' -> return 21
            'm', 'M' -> return 22
            'n', 'N' -> return 23
            'o', 'O' -> return 24
            'p', 'P' -> return 25
            'q', 'Q' -> return 26
            'r', 'R' -> return 27
            's', 'S' -> return 28
            't', 'T' -> return 29
            'u', 'U' -> return 30
            'v', 'V' -> return 31
            'w', 'W' -> return 32
            'x', 'X' -> return 33
            'y', 'Y' -> return 34
            'z', 'Z' -> return 35
        }
        return 0
    }
}