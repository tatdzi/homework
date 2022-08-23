package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private long countOperation;
    private CalculatorWithOperator calc1;
     private CalculatorWithMathCopy calc2;
     private CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator c) {
        calc1 = c;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy c) {
        calc2 = c;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends c) {
        calc3 = c;
    }
    public long getCountOperation() {
        return countOperation;
    }



    public double div(double a,double b){
        countOperation++;
        if (calc1 != null) {
            return calc1.div(a, b);
        }else if (calc2 != null){
            return calc2.div(a, b);
        }else {
            return calc3.div(a, b);
        }
    }
    public double mul(double a,double b){
        countOperation++;
        if (calc1 != null) {
            return calc1.mul(a,b);
        }else if (calc2 != null){
            return calc2.mul(a,b);
        }else {
            return calc3.mul(a,b);
        }
    }
    public double plus(double a,double b){
        countOperation++;
        if (calc1 != null) {
            return calc1.plus(a,b);
        }else if (calc2 != null){
            return calc2.plus(a,b);
        }else {
            return calc3.plus(a,b);
        }
    }
    public double minus(double a,double b){
        countOperation++;
        if (calc1 != null) {
            return calc1.minus(a,b);
        }else if (calc2 != null){
            return calc2.minus(a,b);
        }else {
            return calc3.minus(a,b);
        }
    }
    public double pow(double a,int b){
        countOperation++;
        if (calc1 != null) {
            return calc1.pow(a,b);
        }else if (calc2 != null){
            return calc2.pow(a,b);
        }else {
            return calc3.pow(a,b);
        }
    }
    public double abs(int a){
        countOperation++;
        if (calc1 != null) {
            return calc1.abs(a);
        }else if (calc2 != null){
            return calc2.abs(a);
        }else {
            return calc3.abs(a);
        }
    }
    public double sqrt(double a) {
        countOperation++;
        if (calc1 != null) {
            return calc1.sqrt(a);
        }else if (calc2 != null ){
            return calc2.sqrt(a);
        }else {
            return calc3.sqrt(a);
        }
    }

}
