package ro.sda.fundamentals._7_Static;

public class StaticTest {
    private static int numOfInstances = 0;

    private String name;
    public StaticTest(String name){
        this.name = name;
        numOfInstances++;

    }
    public String getName(){
        return name;
    }
    public static int getNumOfInstances(){
        return numOfInstances;
    }
}
