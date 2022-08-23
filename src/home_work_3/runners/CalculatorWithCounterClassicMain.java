package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        //4.1+15*7+(28/5)^2=140.46

        double result =calc.div(28,5);
        calc.incrementCountOperation();

        result = calc.pow(result,2);
        calc.incrementCountOperation();

        double help = calc.mul(15,7);
        calc.incrementCountOperation();

        result = calc.plus(help,result);
        calc.incrementCountOperation();

        result =calc.plus(4.1,result);
        calc.incrementCountOperation();

        System.out.println(calc.getCounter());
        System.out.println(result);
    }
}
