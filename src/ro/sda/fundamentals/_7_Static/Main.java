package ro.sda.fundamentals._7_Static;

public class Main {
    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + "is instance number " + StaticTest.getNumOfInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + "is instance number " + StaticTest.getNumOfInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + "is instance number " + StaticTest.getNumOfInstances());


    }
}
