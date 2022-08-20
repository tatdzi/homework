package home_work_3.calcs.additional;


public class CalculatorWithCounterAutoComposite {
    CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

    public long getCountOperation() {
        return calc.getCountOperation();
    }

    public double division(double a,double b){
        return calc.division(a,b);
    }
    public double multiplication(double a,double b){
        return  calc.multiplication(a,b);
    }
    public double plus(double a,double b){
        return calc.plus(a,b);
    }
    public double minus(double a,double b){
        return calc.minus(a,b);
    }
    public double pow(double a,int b){
        return calc.pow(a,b);
    }
    public double abs(int a){
        return calc.abs(a);
    }
    public double sqrt(double a) {
        return calc.sqrt(a);
    }

}
