package src.strings_stringBuilder.strings;

import java.util.Locale;

/*
11.1.1.Write a Java program to get the character at index 6 and 10 within the String “Let’s go home, it’s
late already!’
11.1.2.Write a Java program to test if a given String contains the speciﬁed sequence of char values.
11.1.3.Write a Java program to check whether a given String ends with the contents of another String.
11.1.4.Write a Java program to check whether two String objects contain the same data.
11.1.5.Write a Java program to compare a given String to another String, ignoring case considerations.
11.2.1.Write a Java program to replace all the 'd' characters with 'f' characters: “The quick brown fox
jumps over the lazy dog”.
11.2.2.Write a Java program to convert all the characters in a String to lowercase.
11.2.3.Write a Java program to trim any leading or trailing whitespace from a given String.
Original String:
“ Java Exercises "
New String:
“Java Exercises”
 */
public class WorkingWithString {
    public static void main(String[] args) {

        String str1 = "Let’s go home, it’s late already!";
        String str2 = new String("Let’s go home, it’s late already!");
        String str3 = new String(str2.toUpperCase(Locale.ROOT));
        String str4 = new String(str1.toLowerCase(Locale.ROOT) + "???");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1.charAt(6));              //11.1.1
        System.out.println(str1.charAt(10));             //11.1.1
        System.out.println(str1.contains("home"));       //11.1.2
        System.out.println(str1.endsWith("ready!"));     //11.1.3
        System.out.println(str1.endsWith("ready?"));     //11.1.3
        System.out.println(str1.equals(str2));           //11.1.4
        System.out.println(str1.equals("read!"));        //11.1.4
        System.out.println(str1.equalsIgnoreCase(str2)); //11.1.5
        System.out.println(str1.equalsIgnoreCase(str3)); //11.1.5
        System.out.println(str1.equalsIgnoreCase(str4)); //11.1.5
        String str5 = "The quick brown fox jumps over the lazy dog";
        System.out.println(str5);
        System.out.println(str5.replace('d','f')); //11.2.1
        System.out.println(str5.toLowerCase(Locale.ROOT));        //11.2.2
        String str6 = " Java Exercises ";
        System.out.println(str6);        //11.2.2
        System.out.println(str6.trim());        //11.2.2
    }
}
