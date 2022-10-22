package home_work_pizza.pizza.api;

/**
 * Приготовленная пицца
 */
public interface IPizza {
    /**
     * Название пиццы
     * @return
     */
    String getName();

    /**
     * Размер пиццы
     * @return
     */
    int getSize();
}
