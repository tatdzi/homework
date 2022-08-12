package home_work_2.loops;

public class Task_1_1_1 {
    public static void main(String[] args) {
        int number,result;
        String R, I;
        String Result = " 1 ";
        if (args.length==0){
            System.out.println("Нет аргумента!\nЗапустите программу с правильным аргументом!");
            System.exit(0);
        }
        boolean check = checkArgs(args[0]);
        if (!(check)) {
            System.out.println("Неправильный аргумент!\nЗапустите программу с правильным аргументом!");
            System.exit(0);
        }
        number = Integer.parseInt(args[0]);
        System.out.println("Ваш аргумент : "+number);

        result = countFactorial(number);
        if (result == 0) {
            System.out.println("Вы выбрали слишком большоеч число" +
                    "\nПеременная переполнена и не может отразить результат!");
        }else {
            for (int i = 2;i<=number;++i){
                I = Integer.toString(i);
                Result +=" * "+I;
            }
            R = Integer.toString(result);
            Result +=" = "+R;
            System.out.println(Result);
        }
    }

    /**
     * Метод countFactorial вычисляет факториал целочисленного числа с помощью
     * цикла и проверяет его на переполнение.
     * @param f Число для которого нужно посчитать факториал.
     * @return Возвращает результат вычисления, если происходит переполнение возвращает 0.
     */
    public static int countFactorial(int f){
        int result1 = 1;
        int result = 1;
        for (int i = 2; i <= f; ++i) {
            result *= i;
            if (result1 == result / i){ //Универсальная проверка в случае,
                result1 *= i;           //если максимально возможное число было переменным значением.
            }else {                     //Теоретически достаточно сделать if (f > 12) то переполнение.
                result = 0;
                break;
            }
        }
        return result;
    }

    /**
     * Метод checkArgs проверяет можно ли бреобразовать строку в int.
     * @param a Строка
     * @return true - можно преобразовать; false - нельзя преобразовать.
     */
    public static boolean checkArgs(String a){
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }
}
