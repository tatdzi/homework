package home_work_3.calcs.adapter.hendlers;

import home_work_3.calcs.adapter.hendlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternHandler implements IHandler {
    public static final String NUMBER_PATTERN =  "(\\d{1,}(\\.\\d{1,}){0,1})" ;
    private final ICalculator calc;
    private final Pattern pattern;

    public PatternHandler(String reg){
        this.pattern = Pattern.compile(reg);
        this.calc = new CalculatorWithMathExtends();

    }
    protected abstract double calc(Matcher matcher);

    public final String handler(String expression) {
        boolean isMatch = false;
        do {
            Matcher matcher = this.pattern.matcher(expression);
            isMatch = matcher.find();
            if (isMatch) {
                double result = calc(matcher);
                do {
                    expression = expression.replace(matcher.group(), String.valueOf(result));
                }while (expression.contains(matcher.group()));


            }

        }while (isMatch);

        return expression;
    }



    public int getPriority(){
        return 2;
    }

}
