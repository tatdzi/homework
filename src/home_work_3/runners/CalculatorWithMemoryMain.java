package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;


public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        ICalculator I = new CalculatorWithCounterAutoSuper();
        CalculatorWithMemory calc = new CalculatorWithMemory(I);
        calc.plus(4.1,(calc.plus(calc.multiplication(15,7)
                ,calc.pow(calc.division(28,5),2))));
        calc.setMemory();
        System.out.println(calc.getMemory());
        System.out.println(calc.getMemory());
        System.out.println(calc.getCountOperation());
    }
}
