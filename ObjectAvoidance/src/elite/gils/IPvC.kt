package elite.gils

class IPvC {
    internal var address: Int = 0
    internal var value: Int = 0

    constructor(a: IPv4) {
        value = a.value
    }

    constructor(a: IPv6) {
        value = a.value
    }
}