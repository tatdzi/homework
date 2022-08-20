package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithCounterAutoSuper Calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calc) {

        Calc = calc;
    }
        public long getCountOperation() {
            return getCountOperation();
        }

        public double division(double a,double b){
            return division(a,b);
        }
        public double multiplication(double a,double b){
            return  multiplication(a,b);
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
