package home_work_2.loops;

public class Task_1_1_2 {

    /**
     * Метод factorial считает факториал методом рекурсии без проверки на переполнение.
     * @param f  Число для которого нужно посчитать факториал.
     * @return Возвращает результат, в случае переполнения.
     */
    public static int factorial(int f) {
        if (f <= 1) {
                return 1;
            } else{
            if (f > 12){
                return 0;
            }else {
                return f * factorial(f - 1);
            }
        }
    }
}
