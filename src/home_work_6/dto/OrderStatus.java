package home_work_6.dto;

import home_work_6.api.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderStatus implements IOrderStatus {
    private ITicket ticket;
    private List<IStage> stages;
    private List<IStage> stagesDone = new ArrayList<>();
    private boolean done = false;

    public OrderStatus(ITicket ticket, List<IStage> stages) {
        this.ticket = ticket;
        this.stages = stages;
        LocalDateTime time = this.ticket.getCreatAt();

        for (IStage stage: this.stages){
            time = time.plusSeconds(stage.getTime().getSecond());
            if (time.isBefore(LocalDateTime.now())){
                this.stagesDone.add(stage);
            }
        }

        if (this.stages.equals(this.stagesDone)){
            this.done = true;
        }

    }

    @Override
    public ITicket getTicket() {
        return this.ticket;
    }

    @Override
    public List<IStage> getHistory() {
        return this.stagesDone;
    }

    @Override
    public boolean isDone() {
        return this.done;
    }
}
