package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double result = calc.plus(4.1,(calc.plus(calc.multiplication(15,7)
                ,calc.pow(calc.division(28,5),2))));
        System.out.println(result);
    }
}
