package home_work_2.loops;

import home_work_1.AverageNumberSearch;

import java.util.Scanner;

public class Task_1_1_1 {
    public static void main(String[] args) {
        int number,result;
        String R, I;
        String Result = " 1 ";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число!");
        //Проверка положительное ли число.
        if ((number = AverageNumberSearch.enterAndChackInt(in)) < 0) {
            System.out.println("Ввенное число отрицательное!" +
                    "\nПопробуйте еще раз!");
            number = AverageNumberSearch.enterAndChackInt(in);
        }
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
}
