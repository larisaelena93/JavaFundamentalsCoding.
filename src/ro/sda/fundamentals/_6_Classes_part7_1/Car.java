package ro.sda.fundamentals._6_Classes_part7_1;

public class Car {
    private int hp;
    private String brand;
    private boolean isEngineStarted;

    public Car(int hp, String brand, boolean isEngineStarted){
        this.hp = hp;
        this.brand = brand;
        this.isEngineStarted = isEngineStarted;
    }
    public void startEngine(){
        isEngineStarted = true;
        System.out.println("Engine started for " + brand);
    }
    public void stopEngine(){
        isEngineStarted = false;
        System.out.println("Engine stopped for " + brand);
    }
}
class Main{
    public static void main(String[] args){
        Car c1 = new Car(200, "volvo" , false);
        c1.startEngine();
        c1.stopEngine();

        Car c2 = new Car(300,"audi",false);
        c2.startEngine();
    }
}
