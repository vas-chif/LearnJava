package src.strings_stringBuilder.stringBuilder;

public class CharacterDuplicator {

    String duplicatorEachChar(String inputValue) {
        // input --> welcome
        // output --> wweellccoommee

        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < inputValue.length(); index++) {

            char characterToDuplicate = inputValue.charAt(index);
                    sb.append(characterToDuplicate).append(characterToDuplicate);
        }

        return sb.toString();
    }
}
