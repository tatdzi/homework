package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator I;
    private long CountOperation;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator i) {
        I = i;
    }

    public long getCountOperation() {
        return CountOperation;
    }


    public double division(double a,double b){
        CountOperation++;
        return I.division(a, b);

    }
    public double multiplication(double a,double b){
        CountOperation++;
        return I.multiplication(a,b);

    }
    public double plus(double a,double b){
        CountOperation++;
        return I.plus(a,b);

    }
    public double minus(double a,double b){
        CountOperation++;
        return I.minus(a,b);

    }
    public double pow(double a,int b){
        CountOperation++;
        return I.pow(a,b);

    }
    public double abs(int a){
        CountOperation++;
        return I.abs(a);

    }
    public double sqrt(double a) {
        CountOperation++;
        return I.sqrt(a);

    }
}
