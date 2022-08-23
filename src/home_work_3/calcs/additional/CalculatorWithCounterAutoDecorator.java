package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private static ICalculator I;
    private long countOperation;
    public  ICalculator getCalculator(){
        return I;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator I) {
        this.I = I;
    }

    public long getCountOperation() {
        return countOperation;
    }

    @Override
    public double div(double a, double b) {
        countOperation++;
        return I.div(a,b);
    }

    @Override
    public double mul(double a, double b) {
        countOperation++;
        return I.mul(a,b);
    }

    @Override
    public double plus(double a, double b) {
        countOperation++;
        return I.plus(a,b);
    }

    @Override
    public double minus(double a, double b) {
        countOperation++;
        return I.minus(a,b);
    }

    @Override
    public double pow(double a, int b) {
        countOperation++;
        return I.pow(a,b);
    }

    @Override
    public double abs(int a) {
        countOperation++;
        return I.abs(a);
    }

    @Override
    public double sqrt(double a) {
        countOperation++;
       return I.sqrt(a);
    }
}
