package src.strings_stringBuilder.strings;

public class CharacterCheckerMain {
    public static void main(String[] args) {
        CharacterChecker cC = new CharacterChecker();

        System.out.println("moon#night ->" + cC.checkString("moon#night"));
        System.out.println("moon#white ->" + cC.checkString("moon#white"));
        System.out.println("#carblue ->" + cC.checkString("#carblue"));
        System.out.println("mount# ->" + cC.checkString("mount#"));

    }
}
