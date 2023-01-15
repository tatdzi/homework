package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private  ICalculator I;
    private  double memory;

    public  ICalculator getCalculator(){
        return I;
    }

    public CalculatorWithMemoryDecorator(ICalculator I) {
        this.I = I;
    }

    public  double getMemory() {
        double out;
        out = memory;
        memory = 0;
        return out;
    }

    @Override
    public double div(double a, double b) {
        return memory=I.div(a,b);
    }

    @Override
    public double mul(double a, double b) {
        return memory=I.mul(a,b);
    }

    @Override
    public double plus(double a, double b) {
        return memory=I.plus(a,b);
    }

    @Override
    public double minus(double a, double b) {
        return memory=I.minus(a,b);
    }

    @Override
    public double pow(double a, int b) {
        return memory=I.pow(a,b);
    }

    @Override
    public double abs(int a) {
        return memory=I.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return memory=I.sqrt(a);
    }
}
