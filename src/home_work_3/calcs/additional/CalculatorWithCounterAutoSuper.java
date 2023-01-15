package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public double div(double a, double b){
        countOperation++;
        return super.div(a,b);
    }
    public double mul(double a,double b){
        countOperation++;
        return  super.mul(a,b);
    }
    public double plus(double a,double b){
        countOperation++;
        return super.plus(a,b);
    }
    public double minus(double a,double b){
        countOperation++;
        return super.minus(a,b);
    }
    public double pow(double a,int b){
        countOperation++;
        return super.pow(a,b);
    }
    public double abs(int a){
        countOperation++;
        return super.abs(a);
    }
    public double sqrt(double a) {
        countOperation++;
        return super.sqrt(a);
    }
}
