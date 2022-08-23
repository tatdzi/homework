package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long counter;

    public void incrementCountOperation(){
        this.counter = this.counter+1;
    }

    public long getCounter() {
        return counter;
    }
}


