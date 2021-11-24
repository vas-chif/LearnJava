package src.strings_stringBuilder.strings;
/*Write a Java program to check whether the character immediately before and after the # symbol is
same in a given String .
The given string is: moon#night
The before and after character are same: true
The given string is: moon##white
The before and after character are same: false
 */

public class CharacterChecker {

    boolean checkString(String valueToCheck) {
        // moon#night
        int hashtagPosition = valueToCheck.indexOf("#");
        if (hashtagPosition == 0 || hashtagPosition == valueToCheck.length() - 1) {

            return false;
        }
        if (hashtagPosition != -1) {
            int charBeforeHashtag = valueToCheck.charAt(hashtagPosition - 1);
            int charAfterHashtag = valueToCheck.charAt(hashtagPosition + 1);

            return charBeforeHashtag == charAfterHashtag; // este egal la codul de mai jos

           /* if (charBeforeHashtag == charAfterHashtag) {
                return true;
            } else {
                return false;
            }   */
        }

        return false;
    }
}
