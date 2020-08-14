package de.gebel.libs.numbers;

import java.math.*;

/**
 * Decimal represents a decimal number.
 * 
 * @author Claus Gebel
 * 
 * @version 1.0
 */
public class Decimal {
    
    /**
     * Converts a decimal to a binary number.
     *
     * @param arg the decimal number
     *
     * @return the binary number 
     */
    public static BigInteger toBinary (BigInteger arg) {
        return convertToBinary(arg.toString());    
    }
    
    
    /**
     * Converts a decimal to a binary number.
     *
     * @param arg the decimal number
     *
     * @return the binary number 
     */
    public static BigInteger toBinary (String arg) {
        return convertToBinary(arg);
    }
    
    /**
     * Converts a decimal to a binary number.
     *
     * @param arg the decimal number
     *
     * @return the binary number 
     */
    public static BigInteger toBinary (long arg) {
        return convertToBinary(Long.toString(arg));
    }   
    
    private static BigInteger convertToBinary (String arg) {
        BigInteger decNum = new BigInteger(arg);
        BigInteger binNum = new BigInteger("0");
    
        int i = 0;
        do {
            BigInteger power = new BigInteger("10").pow(i); // 1, 10, 100, 1000, ...
            BigInteger remainderNumber = decNum.remainder(new BigInteger("2")); // remainder of number divided by 2
            binNum = binNum.add(remainderNumber.multiply(power)); // number 1: x1 * 1, number 2: x2 * 10, number 3: x3 * 100, ...
            decNum = decNum.divide(new BigInteger("2")); // number divided by 2
            i++;
        } while (decNum.compareTo(new BigInteger("1")) != -1); // 
        return binNum;
    }
}               
