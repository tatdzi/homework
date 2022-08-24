package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private long countOperation;
    private CalculatorWithOperator calc1;
     private CalculatorWithMathCopy calc2;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator c) {
        calc1 = c;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy c) {
        calc2 = c;
    }
    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation(){
        incrementCountOperation(1);
    }
    public void incrementCountOperation(int a){
        this.countOperation += a;
    }

    public double div(double a,double b){
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.div(a, b);
        }else{
            return calc2.div(a, b);

        }
    }
    public double mul(double a,double b){
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.mul(a,b);
        }else{
            return calc2.mul(a,b);

        }
    }
    public double plus(double a,double b){
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.plus(a,b);
        }else {
            return calc2.plus(a,b);

        }
    }
    public double minus(double a,double b){
        countOperation++;
        if (calc1 != null) {
            return calc1.minus(a,b);
        }else{
            return calc2.minus(a,b);

        }
    }
    public double pow(double a,int b){
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.pow(a,b);
        }else {
            return calc2.pow(a, b);
        }
    }
    public double abs(int a){
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.abs(a);
        }else{
            return calc2.abs(a);
        }
    }
    public double sqrt(double a) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.sqrt(a);
        }else {
            return calc2.sqrt(a);
        }
    }

}
