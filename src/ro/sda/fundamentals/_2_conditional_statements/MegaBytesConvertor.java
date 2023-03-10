package ro.sda.fundamentals._2_conditional_statements;

/*
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from
the kilobytes parameter.
Then it need to print a message in the format "XX KB = YY MB and ZZ KB".
XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.
For example, when the parameter kiloBytes is 2500 it need to print "2500 KB = 2 MB and 452 KB"
If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
Examples input/output
* printMegabyesAndKiloBytes(2500); -> should print the following text: "2500 KB = 2 MB and 452 KB"
* printMegabyesAndKiloBytes(-1024); -> should print the following text: "Invalid Value" because parameter is less than 0.
* printMegabyesAndKiloBytes(5000); -> should print the following text: "5000 KB = 4 MB and 904 KB"
*/
public class MegaBytesConvertor {
    public static void main(String[] args) {
       printMegaBytesAndKiloBytes(5000);
       printMegaBytesAndKiloBytes(-1024);
       printMegaBytesAndKiloBytes(2500);

    }

//    5 % 3 = 2;
//    10 % 100 = 10;
//    7 % 2 = 1;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("invalid value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int reminder = kiloBytes%1024;
            System.out.println(kiloBytes+"KB = " + megaBytes + "MB and " + reminder + "KB");
        }
    }
}
