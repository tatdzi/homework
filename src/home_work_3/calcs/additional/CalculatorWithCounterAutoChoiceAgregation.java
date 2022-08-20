package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private long CountOperation;


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
        return CountOperation;
    }


    public double division(double a,double b){
        CountOperation++;
        if (calc1 != null) {
            return calc1.division(a, b);
        }else if (calc2 != null){
            return calc2.division(a, b);
        }else {
            return calc3.division(a, b);
        }
    }
    public double multiplication(double a,double b){
        CountOperation++;
        if (calc1 != null) {
            return calc1.multiplication(a,b);
        }else if (calc2 != null){
            return calc2.multiplication(a,b);
        }else {
            return calc3.multiplication(a,b);
        }
    }
    public double plus(double a,double b){
        CountOperation++;
        if (calc1 != null) {
            return calc1.plus(a,b);
        }else if (calc2 != null){
            return calc2.plus(a,b);
        }else {
            return calc3.plus(a,b);
        }
    }
    public double minus(double a,double b){
        CountOperation++;
        if (calc1 != null) {
            return calc1.minus(a,b);
        }else if (calc2 != null){
            return calc2.minus(a,b);
        }else {
            return calc3.minus(a,b);
        }
    }
    public double pow(double a,int b){
        CountOperation++;
        if (calc1 != null) {
            return calc1.pow(a,b);
        }else if (calc2 != null){
            return calc2.pow(a,b);
        }else {
            return calc3.pow(a,b);
        }
    }
    public double abs(int a){
        CountOperation++;
        if (calc1 != null) {
            return calc1.abs(a);
        }else if (calc2 != null){
            return calc2.abs(a);
        }else {
            return calc3.abs(a);
        }
    }
    public double sqrt(double a) {
        CountOperation++;
        if (calc1 != null) {
            return calc1.sqrt(a);
        }else if (calc2 != null ){
            return calc2.sqrt(a);
        }else {
            return calc3.sqrt(a);
        }
    }

}
