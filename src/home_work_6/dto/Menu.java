package home_work_6.dto;


import home_work_6.api.IMenu;
import home_work_6.api.IMenuRow;

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
