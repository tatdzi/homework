package home_work_3.calcs.adapter.hendlers;

import home_work_3.calcs.adapter.hendlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddHandler extends PatternHandler implements IHandler {
    private final ICalculator calc;

    public  AddHandler(ICalculator calc){
        super(NUMBER_PATTERN+" *\\* *"+NUMBER_PATTERN);
        this.calc = calc;
    }

    protected double calc(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calc.mul(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }


    public int getPriority(){
        return  2;
    }

}
