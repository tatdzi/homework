package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calc4 = new CalculatorWithCounterAutoChoiceAgregation(calc1);
        CalculatorWithCounterAutoChoiceAgregation calc5 = new CalculatorWithCounterAutoChoiceAgregation(calc2);
        CalculatorWithCounterAutoChoiceAgregation calc6 = new CalculatorWithCounterAutoChoiceAgregation(calc3);
        double result4 = calc4.plus(4.1,(calc4.plus(calc4.mul(15,7)
                ,calc4.pow(calc4.div(28,5),2))));
        double result5 = calc5.plus(4.1,(calc5.plus(calc5.mul(15,7)
                ,calc5.pow(calc5.div(28,5),2))));
        double result6 = calc6.plus(4.1,(calc6.plus(calc6.mul(15,7)
                ,calc6.pow(calc6.div(28,5),2))));
        System.out.println(calc4.getCountOperation());
        System.out.println(result4);
        System.out.println(calc5.getCountOperation());
        System.out.println(result5);
        System.out.println(calc6.getCountOperation());
        System.out.println(result6);
    }
}
