package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double div(double a,double b){
        return a / b;
    }
    public double mul(double a,double b){
        return  a * b;
    }
    public double plus(double a,double b){
        return a + b;
    }
    public double minus(double a,double b){
        return a - b;
    }
    public double pow(double a,int b){
        if(b==0){
            return 1;
        }
        return a *pow(a,b-1);
    }
    public double abs(int a){
        return (a < 0) ? -a : a;
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

}
