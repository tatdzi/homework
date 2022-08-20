package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double division(double a,double b){
        return a / b;
    }
    public double multiplication(double a,double b){
        return  a * b;
    }
    public double plus(double a,double b){
        return a + b;
    }
    public double minus(double a,double b){
        return a - b;
    }
    public double pow(double a,int b){
        return Math.pow(a,b);
    }
    public double abs(int a){
        return Math.abs(a);
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }


}
