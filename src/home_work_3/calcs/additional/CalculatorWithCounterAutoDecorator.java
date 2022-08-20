package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private static ICalculator I;
    private static long CountOperation;
    public static ICalculator getCalculator(){
        return I;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator I) {
        this.I = I;
    }

    public static long getCountOperation() {
        return CountOperation;
    }

    @Override
    public double division(double a, double b) {
        CountOperation++;
        return I.division(a,b);
    }

    @Override
    public double multiplication(double a, double b) {
        CountOperation++;
        return I.multiplication(a,b);
    }

    @Override
    public double plus(double a, double b) {
        CountOperation++;
        return I.plus(a,b);
    }

    @Override
    public double minus(double a, double b) {
        CountOperation++;
        return I.minus(a,b);
    }

    @Override
    public double pow(double a, int b) {
        CountOperation++;
        return I.pow(a,b);
    }

    @Override
    public double abs(int a) {
        CountOperation++;
        return I.abs(a);
    }

    @Override
    public double sqrt(double a) {
        CountOperation++;
       return I.sqrt(a);
    }
}
