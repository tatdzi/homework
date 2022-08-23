package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator I;
    private long countOperation;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator i) {
        I = i;
    }
    public long getCountOperation() {
        return countOperation;
    }
    public double div(double a,double b){
        countOperation++;
        return I.div(a, b);
    }
    public double mul(double a,double b){
        countOperation++;
        return I.mul(a,b);

    }
    public double plus(double a,double b){
        countOperation++;
        return I.plus(a,b);

    }
    public double minus(double a,double b){
        countOperation++;
        return I.minus(a,b);

    }
    public double pow(double a,int b){
        countOperation++;
        return I.pow(a,b);

    }
    public double abs(int a){
        countOperation++;
        return I.abs(a);

    }
    public double sqrt(double a) {
        countOperation++;
        return I.sqrt(a);

    }
}
