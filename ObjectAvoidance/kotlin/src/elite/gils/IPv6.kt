package elite.gils

class IPv6(a: IPv4) {
    internal var address: Int = 0
    internal var value: Int = 0

    init {
        value = a.value
    }
}