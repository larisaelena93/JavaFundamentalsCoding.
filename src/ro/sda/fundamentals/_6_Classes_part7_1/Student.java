package ro.sda.fundamentals._6_Classes_part7_1;

public class Student {
//    static means that a variable is SHARED among instances and has the same value for every one of them
//    also static means that a variable belongs to the CLASS not to an instance

    public static String university = "Harvard";
    private String firstName;
    private String lastName;
    private int age;

    public Student (String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public static void method(){
        System.out.println("I'm a static method!");
    }
}
class AnotherMain{
    public static void main(String[] args){
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");

        Student s1 = new Student("Leo", "Messi",35);
        Student s2 = new Student("Catalin", "Manaila",25);
        Student s3 = new Student("Cristiano", "Ronaldo",38);

        s3.university = "Harvard";
        System.out.println(s2.university);
        System.out.println(s1.university);
        System.out.println(Student.university);

        Student.method();

    }
}
