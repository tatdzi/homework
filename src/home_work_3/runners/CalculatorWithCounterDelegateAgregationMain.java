package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper a =new CalculatorWithCounterAutoSuper();
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(a);
        double result = calc.plus(4.1,(calc.plus(calc.mul(15,7)
                ,calc.pow(calc.div(28,5),2))));
        System.out.println(calc.getCountOperation());
        System.out.println(result);
    }
}
