package home_work_pizza.pizza.dto;

import pizza.api.IMenu;
import pizza.api.IMenuRow;

import java.util.List;

public class Menu implements IMenu {
    private List<MenuRow> menuRows;

    public Menu(List<MenuRow> menuRows) {
        this.menuRows = menuRows;
    }
    @Override
    public List<IMenuRow> getItems() {
        return null;
    }
}
