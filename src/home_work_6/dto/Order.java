package home_work_6.dto;


import home_work_6.api.*;

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
