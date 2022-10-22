package home_work_pizza.pizza.dto;

import pizza.api.IStage;

import java.time.LocalTime;

public class Stage implements IStage {
    private String description;
    private LocalTime time;

    public Stage(String description, LocalTime time) {
        this.description = description;
        this.time = time;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public LocalTime getTime() {
        return this.time;
    }
}
