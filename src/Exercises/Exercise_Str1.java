package Exercises;

public class Exercise_Str1 {
    public static void main(String[] args) {

        System.out.println("CHARAT:");
        String str = "Hola a a todos";
        System.out.println(str.charAt(1));

        //Get a substring
        System.out.println("SUBSTRING:");
        String str1 = str.substring(1);
        System.out.println(str1);
        System.out.println("SUBSTRING RANGE:");
        String str2 = str.substring(1,5);
        System.out.println(str2);

        // starwidth y endswith
        System.out.println("STARTWITH:");
        boolean startwith = str.startsWith("H");
        System.out.println(startwith);
        System.out.println("ENDSTRING:");
        boolean endwith = str.endsWith("dos");
        System.out.println(endwith);

        System.out.println("REPLACE OR REPLACEALL METHOD:");
        // Delete white spaces
        String blank = "     HEllo    .  hello   ";
        //ReplaceAll method can use regular expressions to replace with a new string or characters
        blank = blank.replaceAll("\\s","");
        System.out.println(blank);
        //Trim method removes whitespace at the beginning and end of the character string
        System.out.println("TRIP:");
        String testTrip = "   Hello World   ";
        System.out.println(testTrip.trim());
        //Concat method concatenates the specified string to the end of the string
        System.out.println("CONCAT:");
        String s1 = "World";
        s1 = s1.concat("Bang");
        System.out.println(s1);
        //ToLowerCase method converts all character to lowercase
        System.out.println("ToLowerCase:");
        String convertS1 =  "DiegoBustamante";
        convertS1 = convertS1.toLowerCase();
        System.out.println(convertS1);
        //ToUpperCase method converts all character to uppercase
        System.out.println("ToUpperCase:");
        String convertS2 =  "DiegoBustamante";
        convertS2 = convertS2.toUpperCase();
        System.out.println(convertS2);
    }
}
