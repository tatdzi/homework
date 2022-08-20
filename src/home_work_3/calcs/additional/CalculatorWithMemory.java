package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator I;
    private long CountOperation;
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
        return CountOperation;
    }
    public double division(double a,double b){
        CountOperation++;
        return result=I.division(a, b);

    }
    public double multiplication(double a,double b){
        CountOperation++;
        return result=I.multiplication(a,b);

    }
    public double plus(double a,double b){
        CountOperation++;
        return result=I.plus(a,b);

    }
    public double minus(double a,double b){
        CountOperation++;
        return result=I.minus(a,b);

    }
    public double pow(double a,int b){
        CountOperation++;
        return result=I.pow(a,b);

    }
    public double abs(int a){
        CountOperation++;
        return result=I.abs(a);

    }
    public double sqrt(double a) {
        CountOperation++;
        return result=I.sqrt(a);

    }
}
