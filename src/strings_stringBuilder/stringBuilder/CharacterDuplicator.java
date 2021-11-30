package src.strings_stringBuilder.stringBuilder;

/**
 * Perform some manipulations on String.
 * 26/11/2021
 */

public class CharacterDuplicator {
    /**
     * Duplicate each character in the given String.
     * @param inputValue the String the characters of which have to the duplicated.
     * @return a new String where each character is duplicated.
     */

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
