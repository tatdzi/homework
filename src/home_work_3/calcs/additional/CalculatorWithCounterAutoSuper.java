package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long counter;

    public long getCounter() {
        return counter;
    }

    public double division(double a, double b){
        this.counter=this.counter+1;
        return a / b;
    }
    public double multiplication(double a,double b){
        this.counter=this.counter+1;
        return  a * b;
    }
    public double plus(double a,double b){
        this.counter=this.counter+1;
        return a + b;
    }
    public double minus(double a,double b){
        this.counter=this.counter+1;
        return a - b;
    }
    public double pow(double a,int b){
        this.counter=this.counter+1;
        return Math.pow(a,b);
    }
    public double abs(int a){
        this.counter=this.counter+1;
        return Math.abs(a);
    }
    public double sqrt(double a) {
        this.counter=this.counter+1;
        return Math.sqrt(a);
    }
}
