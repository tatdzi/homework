package home_work_pizza.pizza.dto;

import pizza.api.IOrder;
import pizza.api.ISelectedItem;

import java.util.List;

public class Order implements IOrder {
    private List<SelectedItem> selectedItems;

    public Order(List<SelectedItem> selectedItems) {
        this.selectedItems = selectedItems;
    }

    @Override
    public List<ISelectedItem> getSelected() {
        return null;
    }
}
