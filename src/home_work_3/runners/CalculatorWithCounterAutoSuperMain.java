package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double result = calc.plus(4.1,(calc.plus(calc.mul(15,7)
                ,calc.pow(calc.div(28,5),2))));
        System.out.println(calc.getCountOperation());
        System.out.println(result);
    }
}
