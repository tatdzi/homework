package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator I;
    private long countOperation;
    private double result;
    private double memory;
    public CalculatorWithMemory(ICalculator i) {
        I = i;
    }
    public void setMemory(){
        memory = result ;
    }
    public double getMemory() {
        double out;
        out = memory;
        memory = 0;
        return out;
    }

    public long getCountOperation() {
        return countOperation;
    }
    public double div(double a,double b){
        countOperation++;
        return result=I.div(a, b);

    }
    public double mul(double a,double b){
        countOperation++;
        return result=I.mul(a,b);

    }
    public double plus(double a,double b){
        countOperation++;
        return result=I.plus(a,b);

    }
    public double minus(double a,double b){
        countOperation++;
        return result=I.minus(a,b);

    }
    public double pow(double a,int b){
        countOperation++;
        return result=I.pow(a,b);

    }
    public double abs(int a){
        countOperation++;
        return result=I.abs(a);

    }
    public double sqrt(double a) {
        countOperation++;
        return result=I.sqrt(a);

    }
}
