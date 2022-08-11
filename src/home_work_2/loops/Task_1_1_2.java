package home_work_2.loops;

import home_work_1.AverageNumberSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1_1_2 {
    public static void main(String[] args) {
        int number, result;
        String I,R;
        String Result = "1";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число!");
        //Проверка положительное ли число.
        if ((number = AverageNumberSearch.enterAndChackInt(in)) < 0) {
            System.out.println("Ввенное число отрицательное!" +
                    "\nПопробуйте еще раз!");
            number = AverageNumberSearch.enterAndChackInt(in);
        }
        result = factorial(number);
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
