package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    public double pow(double a,int b){
        return Math.pow(a,b);
    }
    public double abs(int a){
        return Math.abs(a);
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
