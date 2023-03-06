package ro.sda.fundamentals._4_Strings;
// Write a Java program to get the character at the given index within the String.
public class Exercise1 {
    public static void main(String[] args) {
        String str = "Java exercise";
        System.out.println("Original = " + str);
        System.out.println("index of e is " + str.indexOf("e"));
        System.out.println("index of a is " + str.indexOf("a"));
        System.out.println("index of non-existent char in string  is " + str.indexOf("J"));


        int idx = str.indexOf("exer");
        System.out.println("Index of exer is " + idx);

        System.out.println("Character at index 7 is " + str.charAt(7));
        System.out.println("Character at index 5 is " + str.charAt(5));
        System.out.println("Character at index 4 is " + str.charAt(4));
        System.out.println("Character at index 15 is " + str.charAt(15));

        char idx8 = str.charAt(8);
        System.out.println("Character at index 8 is " + idx8);
//        System.out.println("Character at index 15 is " + str.charAt(15));
    }
}
