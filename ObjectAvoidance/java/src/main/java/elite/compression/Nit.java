package elite.compression;

/**
 *
 * @author CFerg (Elite)
 * 
 * Data Object - Max Value of 153 for 0-9 storage of two numbers
 */
public class Nit {
    
    /**
     *
     */
    public byte nit;
    
    /**
     *
     */
    public Nit(){
        this.nit = 0;
    }
    
    /**
     *
     * @param num
     */
    public Nit(byte num){
        this.nit = (byte)(num << 4);
    }
    
    /**
     *
     * @param num1
     * @param num2
     */
    public Nit(byte num1, byte num2){
        this.nit = (byte) (toNibble(num1)<<4);
        this.nit += toNibble(num2);
    }
    
    /**
     *
     * @param num
     * @return
     */
    public static byte toNibble(byte num){
        switch(num){
            default:
            case(0):
                return 0b0;
            case(1):
                return 0b1;
            case(2):
                return 0b10;
            case(3):
                return 0b11;
            case(4):
                return 0b100;
            case(5):
                return 0b101;
            case(6):
                return 0b110;
            case(7):
                return 0b111;
            case(8):
                return 0b1000;
            case(9):
                return 0b1001;
        }
    }
    
    public void test(){
        
    }
    
    /**
     *
     * @param b
     * @return
     */
    public static byte getRight(Byte b){
        switch(b){
            //Variants with right nibble being value 0 (Returns 0)
            case(0b0):
            case(0b10000):
            case(0b100000):
            case(0b110000):
            case(0b1000000):
            case(0b1010000):
            case(0b1100000):
            case(0b1110000):
            case(0b11111111111111111111111110000000):
            case(0b11111111111111111111111110010000):
                return 0b0;
                
            //Variants with right nibble being value 1 (Returns 1)
            case(0b1):
            case(0b10001):
            case(0b100001):
            case(0b110001):
            case(0b1000001):
            case(0b1010001):
            case(0b1100001):
            case(0b1110001):
            case(0b11111111111111111111111110000001):
            case(0b11111111111111111111111110010001):
                return 0b1;
                
            //Variants with right nibble being value 2 (Returns 2)
            case(0b10):
            case(0b10010):
            case(0b100010):
            case(0b110010):
            case(0b1000010):
            case(0b1010010):
            case(0b1100010):
            case(0b1110010):
            case(0b11111111111111111111111110000010):
            case(0b11111111111111111111111110010010):
                return 0b10;
                
            //Variants with right nibble being value 3 (Returns 3)
            case(0b11):
            case(0b10011):
            case(0b100011):
            case(0b110011):
            case(0b1000011):
            case(0b1010011):
            case(0b1100011):
            case(0b1110011):
            case(0b11111111111111111111111110000011):
            case(0b11111111111111111111111110010011):
                return 0b11;
                
            //Variants with right nibble being value 4 (Returns 4)
            case(0b100): 
            case(0b10100): 
            case(0b100100): 
            case(0b110100): 
            case(0b1000100): 
            case(0b1010100): 
            case(0b1100100): 
            case(0b1110100): 
            case(0b11111111111111111111111110000100): 
            case(0b11111111111111111111111110010100):
                return 0b100;
                
            //Variants with right nibble being value 5 (Returns 5)
            case(0b101):
            case(0b10101):
            case(0b100101):
            case(0b110101):
            case(0b1000101):
            case(0b1010101):
            case(0b1100101):
            case(0b1110101):
            case(0b11111111111111111111111110000101):
            case(0b11111111111111111111111110010101):
                return 0b101;
                
            //Variants with right nibble being value 6 (Returns 6)
            case(0b110):
            case(0b10110):
            case(0b100110):
            case(0b110110):
            case(0b1000110):
            case(0b1010110):
            case(0b1100110):
            case(0b1110110):
            case(0b11111111111111111111111110000110):
            case(0b11111111111111111111111110010110):
                return 0b110;
                
            //Variants with right nibble being value 7 (Returns 7)
            case(0b111):
            case(0b10111):
            case(0b100111):
            case(0b110111):
            case(0b1000111):
            case(0b1010111):
            case(0b1100111):
            case(0b1110111):
            case(0b11111111111111111111111110000111):
            case(0b11111111111111111111111110010111):
                return 0b111;
                
            //Variants with right nibble being value 8 (Returns 8)
            case(0b1000):
            case(0b11000):
            case(0b101000):
            case(0b111000):
            case(0b1001000):
            case(0b1011000):
            case(0b1101000):
            case(0b1111000):
            case(0b11111111111111111111111110001000):
            case(0b11111111111111111111111110011000):
                return 0b1000;
                
            //Variants with right nibble being value 9 (Returns 9)
            case(0b1001):
            case(0b11001):
            case(0b101001):
            case(0b111001):
            case(0b1001001):
            case(0b1011001):
            case(0b1101001):
            case(0b1111001):
            case(0b11111111111111111111111110001001):
            case(0b11111111111111111111111110011001):
                return 0b1001;
                
            default:
                return (byte)(b & 0b1111);
        }
    }
    
    /**
     *
     * @return
     */
    public byte getRight(){
        switch(this.nit){
            //Variants with right nibble being value 0 (Returns 0)
            case(0b0):
            case(0b10000):
            case(0b100000):
            case(0b110000):
            case(0b1000000):
            case(0b1010000):
            case(0b1100000):
            case(0b1110000):
            case(0b11111111111111111111111110000000):
            case(0b11111111111111111111111110010000):
                return 0b0;
                
            //Variants with right nibble being value 1 (Returns 1)
            case(0b1):
            case(0b10001):
            case(0b100001):
            case(0b110001):
            case(0b1000001):
            case(0b1010001):
            case(0b1100001):
            case(0b1110001):
            case(0b11111111111111111111111110000001):
            case(0b11111111111111111111111110010001):
                return 0b1;
                
            //Variants with right nibble being value 2 (Returns 2)
            case(0b10):
            case(0b10010):
            case(0b100010):
            case(0b110010):
            case(0b1000010):
            case(0b1010010):
            case(0b1100010):
            case(0b1110010):
            case(0b11111111111111111111111110000010):
            case(0b11111111111111111111111110010010):
                return 0b10;
                
            //Variants with right nibble being value 3 (Returns 3)
            case(0b11):
            case(0b10011):
            case(0b100011):
            case(0b110011):
            case(0b1000011):
            case(0b1010011):
            case(0b1100011):
            case(0b1110011):
            case(0b11111111111111111111111110000011):
            case(0b11111111111111111111111110010011):
                return 0b11;
                
            //Variants with right nibble being value 4 (Returns 4)
            case(0b100): 
            case(0b10100): 
            case(0b100100): 
            case(0b110100): 
            case(0b1000100): 
            case(0b1010100): 
            case(0b1100100): 
            case(0b1110100): 
            case(0b11111111111111111111111110000100): 
            case(0b11111111111111111111111110010100):
                return 0b100;
                
            //Variants with right nibble being value 5 (Returns 5)
            case(0b101):
            case(0b10101):
            case(0b100101):
            case(0b110101):
            case(0b1000101):
            case(0b1010101):
            case(0b1100101):
            case(0b1110101):
            case(0b11111111111111111111111110000101):
            case(0b11111111111111111111111110010101):
                return 0b101;
                
            //Variants with right nibble being value 6 (Returns 6)
            case(0b110):
            case(0b10110):
            case(0b100110):
            case(0b110110):
            case(0b1000110):
            case(0b1010110):
            case(0b1100110):
            case(0b1110110):
            case(0b11111111111111111111111110000110):
            case(0b11111111111111111111111110010110):
                return 0b110;
                
            //Variants with right nibble being value 7 (Returns 7)
            case(0b111):
            case(0b10111):
            case(0b100111):
            case(0b110111):
            case(0b1000111):
            case(0b1010111):
            case(0b1100111):
            case(0b1110111):
            case(0b11111111111111111111111110000111):
            case(0b11111111111111111111111110010111):
                return 0b111;
                
            //Variants with right nibble being value 8 (Returns 8)
            case(0b1000):
            case(0b11000):
            case(0b101000):
            case(0b111000):
            case(0b1001000):
            case(0b1011000):
            case(0b1101000):
            case(0b1111000):
            case(0b11111111111111111111111110001000):
            case(0b11111111111111111111111110011000):
                return 0b1000;
                
            //Variants with right nibble being value 9 (Returns 9)
            case(0b1001):
            case(0b11001):
            case(0b101001):
            case(0b111001):
            case(0b1001001):
            case(0b1011001):
            case(0b1101001):
            case(0b1111001):
            case(0b11111111111111111111111110001001):
            case(0b11111111111111111111111110011001):
                return 0b1001;
                
            default:
                return (byte)(this.nit & 0b1111);
        }
    }
    
    /**
     *
     * @param b
     * @return
     */
    public static byte getLeft(Byte b){
        switch(b){
            /**
             * 
             * Left Nibble Value: 0
             * Byte Range Values: 0 -> 9
             * @return 0
             */
            case(0b0):
            case(0b1):
            case(0b10):
            case(0b11):
            case(0b100):
            case(0b101):
            case(0b110):
            case(0b111):
            case(0b1000):
            case(0b1001):
                return 0b0;
                
            /**
             * 
             * Left Nibble Value: 1
             * Byte Range Values: 16 -> 25
             * @return 1
             */
            case(0b10000):
            case(0b10001):
            case(0b10010):
            case(0b10011):
            case(0b10100):
            case(0b10101):
            case(0b10110):
            case(0b10111):
            case(0b11000):
            case(0b11001):
                return 0b1;
                
            /**
             * 
             * Left Nibble Value: 2
             * Byte Range Values: 32 -> 41
             * @return 2
             */
            case(0b100000):
            case(0b100001):
            case(0b100010):
            case(0b100011):
            case(0b100100):
            case(0b100101):
            case(0b100110):
            case(0b100111):
            case(0b101000):
            case(0b101001):
                return 0b10;
                
            /**
             * 
             * Left Nibble Value: 3
             * Byte Range Values: 48 -> 57
             * @return 3
             */
            case(0b110000):
            case(0b110001):
            case(0b110010):
            case(0b110011):
            case(0b110100):
            case(0b110101):
            case(0b110110):
            case(0b110111):
            case(0b111000):
            case(0b111001):
                return 0b11;
                
            /**
             * 
             * Left Nibble Value: 4
             * Byte Range Values: 64 -> 73
             * @return 4
             */
            case(0b1000000):
            case(0b1000001):
            case(0b1000010):
            case(0b1000011):
            case(0b1000100):
            case(0b1000101):
            case(0b1000110):
            case(0b1000111):
            case(0b1001000):
            case(0b1001001):
                return 0b100;
                
            /**
             * 
             * Left Nibble Value: 5
             * Byte Range Values: 80 -> 89
             * @return 5
             */
            case(0b1010000):
            case(0b1010001):
            case(0b1010010):
            case(0b1010011):
            case(0b1010100):
            case(0b1010101):
            case(0b1010110):
            case(0b1010111):
            case(0b1011000):
            case(0b1011001):
                return 0b101;
                
            /**
             * 
             * Left Nibble Value: 6
             * Byte Range Values: 96 -> 105
             * @return 6
             */
            case(0b1100000):
            case(0b1100001):
            case(0b1100010):
            case(0b1100011):
            case(0b1100100):
            case(0b1100101):
            case(0b1100110):
            case(0b1100111):
            case(0b1101000):
            case(0b1101001):
                return 0b110;
                
            /**
             * 
             * Left Nibble Value: 7
             * Byte Range Values: 112 -> 121
             * @return 7
             */
            case(0b1110000):
            case(0b1110001):
            case(0b1110010):
            case(0b1110011):
            case(0b1110100):
            case(0b1110101):
            case(0b1110110):
            case(0b1110111):
            case(0b1111000):
            case(0b1111001):
                return 0b111;
                
            /**
             * 
             * Left Nibble Value: 8
             * Byte Range Values: -128 -> -119
             * @return 8
             */
            case(0b11111111111111111111111110000000):
            case(0b11111111111111111111111110000001):
            case(0b11111111111111111111111110000010):
            case(0b11111111111111111111111110000011):
            case(0b11111111111111111111111110000100):
            case(0b11111111111111111111111110000101):
            case(0b11111111111111111111111110000110):
            case(0b11111111111111111111111110000111):
            case(0b11111111111111111111111110001000):
            case(0b11111111111111111111111110001001):
                return 0b1000;
                
            /**
             * 
             * Left Nibble Value: 9
             * Byte Range Values: -112 -> -103
             * @return 9
             */
            case(0b11111111111111111111111110010000):
            case(0b11111111111111111111111110010001):
            case(0b11111111111111111111111110010010):
            case(0b11111111111111111111111110010011):
            case(0b11111111111111111111111110010100):
            case(0b11111111111111111111111110010101):
            case(0b11111111111111111111111110010110):
            case(0b11111111111111111111111110010111):
            case(0b11111111111111111111111110011000):
            case(0b11111111111111111111111110011001):
                return 0b1001;
                
            /**
             * 
             * Left Nibble Value
             * @return
             */
            default:
                return (byte)(b & 0b11110000);
        }
    }
    
    /**
     *
     * @return
     */
    public byte getLeft(){
        switch(this.nit){
            /**
             * 
             * Left Nibble Value: 0
             * Byte Range Values: 0 -> 9
             * @return 0
             */
            case(0b0):
            case(0b1):
            case(0b10):
            case(0b11):
            case(0b100):
            case(0b101):
            case(0b110):
            case(0b111):
            case(0b1000):
            case(0b1001):
                return 0b0;
                
            /**
             * 
             * Left Nibble Value: 1
             * Byte Range Values: 16 -> 25
             * @return 1
             */
            case(0b10000):
            case(0b10001):
            case(0b10010):
            case(0b10011):
            case(0b10100):
            case(0b10101):
            case(0b10110):
            case(0b10111):
            case(0b11000):
            case(0b11001):
                return 0b1;
                
            /**
             * 
             * Left Nibble Value: 2
             * Byte Range Values: 32 -> 41
             * @return 2
             */
            case(0b100000):
            case(0b100001):
            case(0b100010):
            case(0b100011):
            case(0b100100):
            case(0b100101):
            case(0b100110):
            case(0b100111):
            case(0b101000):
            case(0b101001):
                return 0b10;
                
            /**
             * 
             * Left Nibble Value: 3
             * Byte Range Values: 48 -> 57
             * @return 3
             */
            case(0b110000):
            case(0b110001):
            case(0b110010):
            case(0b110011):
            case(0b110100):
            case(0b110101):
            case(0b110110):
            case(0b110111):
            case(0b111000):
            case(0b111001):
                return 0b11;
                
            /**
             * 
             * Left Nibble Value: 4
             * Byte Range Values: 64 -> 73
             * @return 4
             */
            case(0b1000000):
            case(0b1000001):
            case(0b1000010):
            case(0b1000011):
            case(0b1000100):
            case(0b1000101):
            case(0b1000110):
            case(0b1000111):
            case(0b1001000):
            case(0b1001001):
                return 0b100;
                
            /**
             * 
             * Left Nibble Value: 5
             * Byte Range Values: 80 -> 89
             * @return 5
             */
            case(0b1010000):
            case(0b1010001):
            case(0b1010010):
            case(0b1010011):
            case(0b1010100):
            case(0b1010101):
            case(0b1010110):
            case(0b1010111):
            case(0b1011000):
            case(0b1011001):
                return 0b101;
                
            /**
             * 
             * Left Nibble Value: 6
             * Byte Range Values: 96 -> 105
             * @return 6
             */
            case(0b1100000):
            case(0b1100001):
            case(0b1100010):
            case(0b1100011):
            case(0b1100100):
            case(0b1100101):
            case(0b1100110):
            case(0b1100111):
            case(0b1101000):
            case(0b1101001):
                return 0b110;
                
            /**
             * 
             * Left Nibble Value: 7
             * Byte Range Values: 112 -> 121
             * @return 7
             */
            case(0b1110000):
            case(0b1110001):
            case(0b1110010):
            case(0b1110011):
            case(0b1110100):
            case(0b1110101):
            case(0b1110110):
            case(0b1110111):
            case(0b1111000):
            case(0b1111001):
                return 0b111;
                
            /**
             * 
             * Left Nibble Value: 8
             * Byte Range Values: -128 -> -119
             * @return 8
             */
            case(0b11111111111111111111111110000000):
            case(0b11111111111111111111111110000001):
            case(0b11111111111111111111111110000010):
            case(0b11111111111111111111111110000011):
            case(0b11111111111111111111111110000100):
            case(0b11111111111111111111111110000101):
            case(0b11111111111111111111111110000110):
            case(0b11111111111111111111111110000111):
            case(0b11111111111111111111111110001000):
            case(0b11111111111111111111111110001001):
                return 0b1000;
                
            /**
             * 
             * Left Nibble Value: 9
             * Byte Range Values: -112 -> -103
             * @return 9
             */
            case(0b11111111111111111111111110010000):
            case(0b11111111111111111111111110010001):
            case(0b11111111111111111111111110010010):
            case(0b11111111111111111111111110010011):
            case(0b11111111111111111111111110010100):
            case(0b11111111111111111111111110010101):
            case(0b11111111111111111111111110010110):
            case(0b11111111111111111111111110010111):
            case(0b11111111111111111111111110011000):
            case(0b11111111111111111111111110011001):
                return 0b1001;
                
            /**
             * 
             * Left Nibble Value
             * @return
             */
            default:
                return (byte)(this.nit & 0b11110000);
        }
    }
}