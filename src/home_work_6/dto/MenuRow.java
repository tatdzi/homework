package home_work_6.dto;


import home_work_6.api.IMenuRow;
import home_work_6.api.IPizzaInfo;

public class MenuRow implements IMenuRow {
    private IPizzaInfo pizzaInfo;
    private double prise;

    public MenuRow(IPizzaInfo pizzaInfo,double prise) {
        this.pizzaInfo = pizzaInfo;
        this.prise = prise;
    }

    @Override
    public IPizzaInfo getInfo() {
        return this.pizzaInfo;
    }

    @Override
    public double getPrice() {
        return this.prise;
    }
}
