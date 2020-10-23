package de.gebelcl.libs.numbers;

import java.math.*;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * Binary represents a binary number.
 * 
 * @author Claus Gebel
 * 
 * @version 1.0
 */
public class Binary {
    /**
     * Converts a binary to a decimal number.
     *
     * @param arg the binary number
     *
     * @return the decimal number 
     */
    public static BigInteger toDecimal (BigInteger arg) {
        return convertToDecimal(arg.toString());    
    }
    
    /**
     * Converts a binary to a decimal number.
     *
     * @param arg the binary number
     *
     * @return the decimal number 
     */
    public static BigInteger toDecimal (String arg) {
        return convertToDecimal(arg);
    }
    
    /**
     * Converts a binary to a decimal number.
     *
     * @param arg the binary number
     *
     * @return the decimal number 
     */
    public static BigInteger toDecimal (long arg) {
        return convertToDecimal(Long.toString(arg));
    }
    
    private static BigInteger convertToDecimal (String arg) {
        String binNumString = new String(arg);
        BigInteger decNum = new BigInteger("0");
        int binLength = arg.length();
         
        for (int i=binLength; i > 0; i--) {
            BigInteger multiplicator = new BigInteger("2").pow(binLength - i); 
            if (binNumString.charAt(i-1)!='0' & binNumString.charAt(i-1)!='1') { //if number is not 0 or 1
                System.out.println("Error: Please use a binary number.");
                System.exit(-1);
            }
                
            BigInteger multiplied = multiplicator.multiply(new BigInteger(String.valueOf(binNumString.charAt(i-1))));
            decNum = decNum.add(multiplied);
        }
        return decNum;
    }  
     
    
    /**
     * Add two binary numbers.
     *
     * @param augend the first number
     *
     * @param addend the second number
     * 
     * @return the result 
     */
    public static BigInteger add(String augend, String addend) {
        return addNumbers(augend, addend);
    }
    
    /**
     * Add two binary numbers.
     *
     * @param augend the first number
     *
     * @param addend the second number
     * 
     * @return the result 
     */
    public static BigInteger add (long augend, long addend) {
        return addNumbers(Long.toString(augend), Long.toString(addend));   
    }
    
    
    /**
     * Add two binary numbers.
     *
     * @param augend the first number
     *
     * @param addend the second number
     * 
     * @return the result 
     */
    public static BigInteger add (BigInteger augend, BigInteger addend) {
        return addNumbers(augend.toString(), addend.toString());   
    }
    
    private static BigInteger addNumbers(String aug, String add) {
        BigInteger augd = Binary.toDecimal(aug);
        BigInteger addd = Binary.toDecimal(add);    
        BigInteger res = augd.add(addd);
        return Decimal.toBinary(res);
    } 
    
    /**
     * Subtract two binary numbers.
     *
     * @param minuend the first number
     *
     * @param subtrahend the second number
     * 
     * @return the result 
     */
    public static BigInteger subtract(String minuend, String subtrahend) {
        return subtractNumbers(minuend, subtrahend);
    }  
    
    /**
     * Subtract two binary numbers.
     *
     * @param minuend the first number
     *
     * @param subtrahend the second number
     * 
     * @return the result 
     */
    public static BigInteger subtract(BigInteger minuend, BigInteger subtrahend) {
        return subtractNumbers(minuend.toString(), subtrahend.toString());
    }
    
    /**
     * Subtract two binary numbers.
     *
     * @param minuend the first number
     *
     * @param subtrahend the second number
     * 
     * @return the result 
     */
    public static BigInteger subtract(long minuend, long subtrahend) {
        return subtractNumbers(Long.toString(minuend), Long.toString(subtrahend));
    }   
    
    private static BigInteger subtractNumbers(String min, String sub) {
        BigInteger mind = Binary.toDecimal(min);
        BigInteger subd = Binary.toDecimal(sub);
        BigInteger res = mind.subtract(subd);
        return Decimal.toBinary(res);    
    }
    
    /**
     * Multiply two binary numbers.
     *
     * @param factor1 the first number
     *
     * @param factor2 the second number
     * 
     * @return the result 
     */
    public static BigInteger multiply(String factor1, String factor2) {
        return multiplyNumbers(factor1, factor2);
    }  
    
    /**
     * Multiply two binary numbers.
     *
     * @param factor1 the first number
     *
     * @param factor2 the second number
     * 
     * @return the result 
     */
    public static BigInteger multiply(BigInteger factor1, BigInteger factor2) {
        return multiplyNumbers(factor1.toString(), factor2.toString());
    }  
    
    /**
     * Multiply two binary numbers.
     *
     * @param factor1 the first number
     *
     * @param factor2 the second number
     * 
     * @return the result 
     */
    public static BigInteger multiply(long factor1, long factor2) {
        return multiplyNumbers(Long.toString(factor1), Long.toString(factor2));
    }  
    private static BigInteger multiplyNumbers(String fac1, String fac2) {
        BigInteger facd1 = Binary.toDecimal(fac1);
        BigInteger facd2 = Binary.toDecimal(fac2);
        BigInteger res = facd1.multiply(facd2);
        return Decimal.toBinary(res);    
    }
    
    /**
     * Divide two binary numbers.
     *
     * @param dividend the first number
     *
     * @param divisor the second number
     * 
     * @return the result 
     */
    public static BigInteger divide(String dividend, String divisor) {
        return divideNumbers(dividend, divisor);
    }
    
    /**
     * Divide two binary numbers.
     *
     * @param dividend the first number
     *
     * @param divisor the second number
     * 
     * @return the result 
     */
    public static BigInteger divide(BigInteger dividend, BigInteger divisor) {
        return divideNumbers(dividend.toString(), divisor.toString());
    }
    
    /**
     * Divide two binary numbers.
     *
     * @param dividend the first number
     *
     * @param divisor the second number
     * 
     * @return the result 
     */
    public static BigInteger divide(long dividend, long divisor) {
        return divideNumbers(Long.toString(dividend), Long.toString(divisor));
    }
    
    private static BigInteger divideNumbers(String divid, String divis) {
        BigInteger dividd = Binary.toDecimal(divid);
        BigInteger divisd = Binary.toDecimal(divis);
        BigInteger res = dividd.divide(divisd);
        return Decimal.toBinary(res);         
    }
    
    /**
     * Divides two binary numbers and gives the remainder as the result.
     *
     * @param dividend the first number
     *
     * @param divisor the second number
     * 
     * @return the result 
     */
    public static BigInteger remainder(String dividend, String divisor) {
        return remainderNumbers(dividend, divisor);
    }
    
    /**
     * Divides two binary numbers and gives the remainder as the result.
     *
     * @param dividend the first number
     *
     * @param divisor the second number
     * 
     * @return the result 
     */
    public static BigInteger remainder(BigInteger dividend, BigInteger divisor) {
        return remainderNumbers(dividend.toString(), divisor.toString());
    }
    
    /**
     * Divides two binary numbers and gives the remainder as the result.
     *
     * @param dividend the first number
     *
     * @param divisor the second number
     * 
     * @return the result 
     */
    public static BigInteger remainder(long dividend, long divisor) {
        return remainderNumbers(Long.toString(dividend), Long.toString(divisor));
    }
    
        private static BigInteger remainderNumbers(String divid, String divis) {
        BigInteger dividd = Binary.toDecimal(divid);
        BigInteger divisd = Binary.toDecimal(divis);
        BigInteger res = dividd.remainder(divisd);
        return Decimal.toBinary(res);         
    }
}
