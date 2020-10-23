import de.gebel.libs.numbers.*;

public class TestBinary {
    public static void main (String args[] ) {
        System.out.println("1110 + 11011011110 = " + Binary.add("1110", "11011011110"));
        System.out.println("\n11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111 - 1 =\n" + Binary.subtract("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "1"));
        System.out.println("\n101010 * 1001 = " + Binary.multiply("101010", "1001"));
        System.out.println("\n111000 / 111 = " + Binary.divide("111000", "110") + ", (remainder: " + Binary.remainder("111000", "110") + ")");
    }      
}
