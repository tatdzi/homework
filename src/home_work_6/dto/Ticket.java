package home_work_6.dto;

import home_work_6.api.*;

import java.time.LocalDateTime;

public class Ticket implements ITicket {
    private IOrder order;
    private String number;
    private LocalDateTime createAt;

    public Ticket(IOrder order, String number) {
        this.order = order;
        this.number = number;
        this.createAt = LocalDateTime.now();
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public LocalDateTime getCreatAt() {
        return this.createAt;
    }

    @Override
    public IOrder getOrder() {
        return this.order;
    }
}
