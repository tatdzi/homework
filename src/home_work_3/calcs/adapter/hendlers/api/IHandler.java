package home_work_3.calcs.adapter.hendlers.api;

public interface IHandler {
    String handler(String expression);
    int getPriority();
}
