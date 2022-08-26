package home_work_3.calcs.adapter.hendlers;

import home_work_3.calcs.adapter.CalculatorAdapter;
import home_work_3.calcs.adapter.hendlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.Objects;
import java.util.regex.Matcher;

public class BraсketsHandler extends PatternHandler implements IHandler {
    private final ICalculator calc;

    public BraсketsHandler(ICalculator calc){
        super("\\((.+)\\)");
        //super("\\( *"+NUMBER_PATTERN+" *"+s+" *"+NUMBER_PATTERN+" *\\)");
        this.calc = calc;
    }

    protected double calc(Matcher matcher) {
        CalculatorAdapter calc = new CalculatorAdapter();
        String operand1 = matcher.group(1);
        double result = calc.calcs(operand1);
        return result;



       // CalculatorAdapter calc = new CalculatorAdapter();
       // String operand1 = matcher.group(1);
       // String operand2 = matcher.group(3);
       // String operand3 = matcher.group(4);
       // double result = calc.calcs(operand1+operand2+operand3);
       // return result;
    }


    public int getPriority(){return 1 ;
    }

}
