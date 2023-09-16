package home_work_6.dto;


import home_work_6.api.*;

public class SelectedItem implements ISelectedItem {
    private MenuRow menuRow;
    private int count;

    public SelectedItem(MenuRow menuRow, int count) {
        this.menuRow = menuRow;
        this.count = count;
    }

    @Override
    public IMenuRow getRow() {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
