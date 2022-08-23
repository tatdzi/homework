package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator v = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithOperator()));

        if (v instanceof CalculatorWithCounterAutoDecorator){
            CalculatorWithCounterAutoDecorator countOperation = (CalculatorWithCounterAutoDecorator) v;
            if(((CalculatorWithCounterAutoDecorator) v).getCalculator() instanceof CalculatorWithMemoryDecorator){
                CalculatorWithMemoryDecorator memory = ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) v).getCalculator());
                countOperation.div(28,5);
                countOperation.pow(memory.getMemory(),2);
                countOperation.plus(4.1,memory.getMemory());
                countOperation.plus(memory.getMemory(),v.mul(15,7));

                System.out.println(memory.getMemory());
                System.out.println(memory.getMemory());
                System.out.println(countOperation.getCountOperation());
            }

        }

    }
}
