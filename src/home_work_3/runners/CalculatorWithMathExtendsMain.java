package home_work_3.runners;


import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double result = calc.plus(4.1,(calc.plus(calc.mul(15,7)
                ,calc.pow(calc.div(28,5),2))));
        System.out.println(result);
    }
}
