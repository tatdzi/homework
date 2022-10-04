package home_work_pizza.pizza.api;

import java.util.List;

/**
 * Меню
 */
public interface IMenu {
    /**
     * Доступные к заказу пункты
     * @return пункты которые можно заказать
     */
    List<IMenuRow> getItems();
}
