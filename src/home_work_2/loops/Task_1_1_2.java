package home_work_2.loops;

public class Task_1_1_2 {
    public static void main(String[] args) {
        int number, result;
        if (args.length == 0) {
            System.out.println("Нет аргумента!\nЗапустите программу с правильным аргументом!");
            return;
        }
        boolean check = Task_1_1_1.checkArgs(args[0]);
        if (!check){
            return;
        }
        number = Integer.parseInt(args[0]);
        System.out.println("Ваш аргумент : "+number);
        result = factorial(number);
        if (result == 0) {
            System.out.println("Вы выбрали слишком большоеч число" +
                    "\nПеременная переполнена и не может отразить результат!");
        }
        String Result = Task_1_1_1.format(number,result);
        System.out.println(Result);


    }

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
