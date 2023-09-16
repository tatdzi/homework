package home_work_6;

import home_work_6.api.*;
import home_work_6.dto.*;

import java.util.List;

public class Pzz implements IPizzeria {
    private Menu menu;
    private int counter;
    private List<IStage> stages;

    public Pzz(Menu menu, List<IStage> stages) {
        this.menu = menu;
        this.stages = stages;
    }

    @Override
    public Menu takeMenu() {
        return this.menu;
    }

    @Override
    public Ticket create(IOrder order) {
        String number = "Pzz"+counter;
        this.counter++;
        if (this.counter>100){
            this.counter=1;
        }
        return new Ticket(order,number);
    }

    @Override
    public OrderStatus check(ITicket ticket) {
        return new OrderStatus(ticket, this.stages);
    }

    @Override
    public DoneOrder pickup(ITicket ticket) {
        IOrderStatus status = check(ticket);
        if (status.isDone()) {
            return new DoneOrder(ticket);
        } else {
            return null;
        }
    }
}
