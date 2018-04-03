package elite.gils;

public class IPvC {
    int address;
    int value;

    public IPvC(IPv4 a){
        value = a.value;
    }
    
    public IPvC(IPv6 a){
        value = a.value;
    }
}