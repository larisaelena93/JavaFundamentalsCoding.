package ro.sda.fundamentals._4_Strings;
// Write a Java program to convert all the characters in a string to lowercase and uppercase.
public class Exercise3 {
    public static void main(String[] args) {
        String str = "Learning Java Is Fun";

        System.out.println("Original string is " + str);



        String str2 = str.toUpperCase();
        System.out.println("Uppercase string is " + str2);

        String str3 = str.toLowerCase();
        System.out.println("Lowercase string is " + str3) ;

        System.out.println("Original string afer methods called  " + str);

        str.length();
        System.out.println("Length of the string is: " + str.length());
        System.out.println("First index of n the string is: " + str.lastIndexOf("n"));
        System.out.println("Last index of the string is: " + str.lastIndexOf("n"));

        System.out.println("String starts with Learn? - " + str.startsWith("Learn"));
        System.out.println("String starts with Java? - "+ str.startsWith("Java"));

        System.out.println("String ends with fun? - "  + str.endsWith("Fun"));
        System.out.println("String ends with Java? - "  + str.endsWith("Java"));




    }
}
