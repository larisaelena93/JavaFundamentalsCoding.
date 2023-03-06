package ro.sda.fundamentals._2_conditional_statements;
/*
Write a method called printNumberInWord. The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is
0, 1, 2, .... 9 or other for any other number including negative numbers.
You can use if-else statement or switch statement whatever is easier for you.
*/

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
    }
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
            System.out.println("zero");
            break;
            case 1:
             System.out.println("one");
             break;
            case 2:
             System.out.println("two");
             break;
            case 3:
             System.out.println("three");
             break;
            case 4:
             System.out.println("four");
             break;
            case 5:
             System.out.println("five");
             break;
            case 6:
             System.out.println("six");
             break;
            case 7:
             System.out.println("seven");
             break;
            case 8:
             System.out.println("eight");
             break;
            default:
             System.out.println("default");
        }
    }
    public static String  convertNumberToString(int number){
        if (number == 0) {
            return "ZERO";
        } else if (number == 1) {
            return "ONE";
        } else if (number == 2) {
            return "TWO";
        } else if (number == 3) {
            return "THREE";
        } else if (number == 4) {
            return "FOUR";
        } else if (number == 5) {
            return "FIVE";
        } else if (number == 6) {
            return "SIX";
        } else if (number == 7) {
            return "SEVEN";
        } else if (number == 8) {
            return "EIGHT";
        } else if (number == 9) {
            return "NINE";
        } else {
            return "OTHER";
        }
    }
}
