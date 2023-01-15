package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithCounterAutoSuper calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calc) {
        this.calc = calc;
    }
        public long getCountOperation() {
            return calc.getCountOperation();
        }
        public double div(double a,double b){
            return calc.div(a,b);
        }
        public double mul(double a,double b){
            return  calc.mul(a,b);
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
