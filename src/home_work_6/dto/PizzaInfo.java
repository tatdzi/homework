package home_work_6.dto;


import home_work_6.api.IPizzaInfo;

public class PizzaInfo implements IPizzaInfo {
    private String name;
    private String description;
    private int size;

    public PizzaInfo(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
