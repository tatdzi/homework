package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.hendlers.*;
import home_work_3.calcs.adapter.hendlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.PriorityQueue;

public class CalculatorAdapter {
    private ICalculator calc;
    private final PriorityQueue<IHandler> queue = new PriorityQueue<>
            ((o1, o2) -> o1.getPriority()-o2.getPriority());


    public CalculatorAdapter(){
        this.calc = new CalculatorWithMathExtends();
        queue.add(new PlusHandler(this.calc));
        queue.add(new BraсketsHandler(this.calc));
        queue.add(new PowHandler(this.calc));
        queue.add(new AddHandler(this.calc));
        queue.add(new MinusHandler(this.calc));
        queue.add(new DivHandler(this.calc));
    }
    public double calcs(String expression){
        PriorityQueue<IHandler> queue1 = new PriorityQueue<>(queue);
        while (!(queue1.isEmpty())){
            expression = queue1.poll().handler(expression);
        }
        return Double.parseDouble(expression);
    }

}
