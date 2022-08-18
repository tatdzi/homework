package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double result = calc.plus(4.1,(calc.plus(calc.multiplication(15,7)
                ,calc.pow(calc.division(28,5),2))));
        System.out.println(calc.getCounter());
        System.out.println(result);
    }
}
