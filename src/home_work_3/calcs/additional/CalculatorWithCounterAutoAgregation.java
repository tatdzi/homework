package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithCounterAutoSuper calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calc) {
        this.calc = calc;
    }
        public long getCountOperation() {
            return getCountOperation();
        }
        public double div(double a,double b){
            return div(a,b);
        }
        public double mul(double a,double b){
            return  mul(a,b);
        }
        public double plus(double a,double b){
            return plus(a,b);
        }
        public double minus(double a,double b){
            return minus(a,b);
        }
        public double pow(double a,int b){
            return pow(a,b);
        }
        public double abs(int a){
            return abs(a);
        }
        public double sqrt(double a) {
            return sqrt(a);
        }
}
