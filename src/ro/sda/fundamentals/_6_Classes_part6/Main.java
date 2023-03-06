package ro.sda.fundamentals._6_Classes_part6;

public class Main {
    public static void main(String[] args) {
     Point p1 = new Point(23,34);
     Point p2 = new Point(12,33);

        System.out.println("Distance (0.0) = " + p1.distance());
        System.out.println("Distance (7.10 = " + p1.distance(7,10));

        System.out.println("Distance (p2) = " + p1.distance(p2));
    }


}
