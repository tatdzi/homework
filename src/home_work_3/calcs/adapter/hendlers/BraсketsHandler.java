package home_work_3.calcs.adapter.hendlers;

import home_work_3.calcs.adapter.CalculatorAdapter;
import home_work_3.calcs.adapter.hendlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.Objects;
import java.util.regex.Matcher;

public class BraсketsHandler extends PatternHandler implements IHandler {
    private final ICalculator calc;

    public BraсketsHandler(ICalculator calc){
        super("([(]{1}([^()]+)[)]{1})");
        this.calc = calc;
    }

    protected double calc(Matcher matcher) {
        CalculatorAdapter calc = new CalculatorAdapter();
        String operand1 = matcher.group(2);
        double result = calc.calcs(operand1);
        return result;
    }


    public int getPriority(){return 1 ;
    }

}
