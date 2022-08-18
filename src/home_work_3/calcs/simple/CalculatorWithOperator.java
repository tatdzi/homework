package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    public double division(double a,double b){
        return a / b;
    }
    public double multiplication(double a,double b){
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
