import de.gebel.libs.types.Type;

public class TestTypes {
    public static void main(String[] args) {
        System.out.println("Der R�ckgabetyp des arithmetischen Ausdrucks '23.5 + 4' lautet: " + Type.getType(23.5 + 4));
    }
}