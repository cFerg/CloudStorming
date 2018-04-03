package elite.math;

import java.lang.reflect.Array;

/**
 *
 * @author CFerg (Elite)
 */
public class Functions {
    
    /**
     * Returns a square of an int number
     * 
     * @param n The number to be squared
     * @return 
     */
    public int square(int n){
        return (n * n);
    }
    
    /**
     * Returns a square of a byte number
     * 
     * @param n The number to be squared
     * @return 
     */
    public int square(byte n){
        return (n * n);
    }
    
    /**
     * Returns a square of a short number
     * 
     * @param n The number to be squared
     * @return 
     */
    public int square(short n){
        return (n * n);
    }
    
    /**
     * Returns a square of a double number
     * 
     * @param n The number to be squared
     * @return 
     */
    public double square(double n){
        return (n * n);
        
    }
    
    /**
     * Returns a square of a float number
     * 
     * @param n The number to be squared
     * @return 
     */
    public float square(float n){
        return (n * n);
    }
    
    /**
     * Returns a preset square of a single-digit number
     * 
     * @param n The number to be squared
     * @return 
     */
    private int getSquare(int n){
        switch(n){
            case 0: 
                return 0;
            case 1: 
            case -1:
                return 1;
            case 2: 
            case -2:
                return 4;
            case 3: 
            case -3:
                return 9;
            case 4: 
            case -4:
                return 16;
            case 5: 
            case -5:
                return 25;
            case 6: 
            case -6:
                return 36;
            case 7: 
            case -7:
                return 49;
            case 8:
            case -8:
                return 64;
            case 9: 
            case -9:
                return 81;
            default:
                return square(n);
        }
    }
    
    /**
     * 
     * @param n
     * @return 
     */
    private int getCount(double n){
        int value = 0;
        
        if (n >= 0){
            
        }
        
        //The value is negative - make it positive so we can get the count
        else if (n < 0){
            double x = (0 - n);
            
        }
        
        
        //The value doesn't exist - we'll set the count to zero
        else{
            value = 0;
        }
        
        return value;
    }
    
    //====================================
    //Square Root
    //====================================
    
    /**
     * 
     * @param n
     * @return 
     */
    public double squareRoot(double n){
        double value = 0;
        int digits = getCount(n);
        
        
        
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
        
        return value;
    }
    
    /**
     * 
     * @param n
     * @return 
     */
    public int getBinaryValue(byte n){

        char[] bit = String.valueOf(n).toCharArray();

        int value = 0;

        int currentMultiplier = 1;

        Object l = 1;

        for (int I = bit.length; I > 0; I--){
             if (Array.get(bit, I).equals(l)){
                  value += currentMultiplier;
             }

             currentMultiplier = (currentMultiplier * 2);
        }

        return value;
    }
}