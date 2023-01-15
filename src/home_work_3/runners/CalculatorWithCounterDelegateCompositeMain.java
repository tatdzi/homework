package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        double result = calc.plus(4.1,(calc.plus(calc.mul(15,7)
                ,calc.pow(calc.div(28,5),2))));
        System.out.println(calc.getCountOperation());
        System.out.println(result);
    }
}
