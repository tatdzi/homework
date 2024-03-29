package home_work_6.dto;

import home_work_6.api.IDoneOrder;
import home_work_6.api.IPizza;
import home_work_6.api.ISelectedItem;
import home_work_6.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class DoneOrder implements IDoneOrder {
    private ITicket ticket;
    private List<IPizza> pizzas = new ArrayList<>();

    public DoneOrder(ITicket ticket) {
        this.ticket = ticket;
        List<ISelectedItem> items = this.ticket.getOrder().getSelected();
        for (ISelectedItem item:items){
            pizzas.add(new Pizza(
                    item.getRow().getInfo().getName(),
                    item.getRow().getInfo().getSize()));
        }
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return pizzas;
    }
}
