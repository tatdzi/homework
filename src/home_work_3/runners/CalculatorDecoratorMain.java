package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator v = new CalculatorWithMemoryDecorator(new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator()));
        double result = v.plus(4.1,(v.plus(v.multiplication(15,7)
                ,v.pow(v.division(28,5),2))));
        System.out.println(CalculatorWithMemoryDecorator.getMemory());
        System.out.println(CalculatorWithMemoryDecorator.getMemory());
        System.out.println(CalculatorWithCounterAutoDecorator.getCountOperation());
        System.out.println(CalculatorWithCounterAutoDecorator.getCalculator());
        System.out.println(CalculatorWithMemoryDecorator.getCalculator());


    }
}
