package ro.sda.fundamentals._6_Classes_part2;

import java.text.DecimalFormat;

public class Main {


    public static void main(String[] args) {


        SimpleCalculator calc = new SimpleCalculator();
        SimpleCalculator anotherCalc = new SimpleCalculator();
        calc.setFirstNumber(100.73);
        calc.setSecondNumber((50.23));

        calc.getAdditionResult();


        anotherCalc.setFirstNumber(56.70);
        anotherCalc.setSecondNumber(0.0);

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Addition result: " + calc.getAdditionResult());
        System.out.println("Substraction result: " + df.format(calc.getSubstractionResult()));
        System.out.println("Multiplication result: " + df.format(calc.getMultiplicationRedsult()));
        System.out.format("Division result: %.3f \n", calc.getDivisionResult());


        System.out.println("Addition result: " + anotherCalc.getAdditionResult());
        System.out.println("Substraction result: " + anotherCalc.getSubstractionResult());
        System.out.println("Multiplication result: " + anotherCalc.getMultiplicationRedsult());
        System.out.println("Division result: " + anotherCalc.getDivisionResult());

        SimpleCalculator calc2 = new SimpleCalculator(29.23, 12.67);

        System.out.println("Addition result: " + calc2.getAdditionResult());
        System.out.println("Substraction result: " + calc2.getSubstractionResult());

    }
}
