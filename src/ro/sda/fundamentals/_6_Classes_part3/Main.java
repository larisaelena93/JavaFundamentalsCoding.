package ro.sda.fundamentals._6_Classes_part3;

public class Main {
    public static void main(String[] args) {
//        we created an instance of the class Wall (variable/reference called wall1)
        Wall wall1 = new Wall();

//        we called the setter for the width field on the instance that was previously created
//        - using this setter we will initialize the field /attribute/instance variable height of the instance (wall1) with the value is sent as a parameter.
        wall1.setWidth(-100);

//        we called the setter for the height field on the instance that was previously created
//        - using this setter we will initialize the field /attribute/instance variable height of the instance (wall1) with the value is sent as a parameter.
        wall1.setHeight(50);


//        we retrive the value of the instance variable - width - of the wall1 instance using the getter

        System.out.println("Width = " + wall1.getWidth());

//        we retrive the value of the instance variable - height - of the wall1 instance using the getter
        System.out.println("Height = " + wall1.getHeight());

//        we call the -getArea() method - on the instance wall1
        System.out.println("area = " + wall1.getArea());

//        we created another instance of tge class Wall (variable/reference called wall2) - we used the constructor with params
        Wall wall2=  new Wall(72,25);


//        we retrive the value of the instance variable -width- of the wall2 instance using the getter
        System.out.println("width = " + wall2.getWidth());

//        we retrive the value of the instance variable - height - of the wall2 instance using the getter
        System.out.println("height= " + wall2.getHeight());

//        we call the getArea() method - on the instance wall2
        System.out.println("Area = " + wall2.getArea());

    }
}
