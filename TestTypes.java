import de.gebel.libs.types.Type;

public class TestTypes {
    public static void main(String[] args) {
        System.out.println("Der Rückgabetyp des arithmetischen Ausdrucks '23.5 + 4' lautet: " + Type.getType(23.5 + 4));
    }
}