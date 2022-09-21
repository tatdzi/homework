package home_work_2.loops;

import home_work_1.AverageNumberSearch;
import java.util.Scanner;

public class Task_1_1_1 {

    /**
     * Метод countFactorial вычисляет факториал целочисленного числа с помощью
     * цикла и проверяет его на переполнение.
     * @param f Число для которого нужно посчитать факториал.
     * @return Возвращает результат вычисления, если происходит переполнение возвращает 0.
     */
    public static int countFactorial(int f){
        long r = 1;                                   // Проверка на переполнение int
        long result=1;                                //public static int multiplyExact(int x, int y) {
        for (long i = 2; i <= f; ++i) {               //        long r = (long)x * (long)y;
            result =r*i;                              //        if ((int)r != r) {
            if ((int)result != result){               //            throw new ArithmeticException("integer overflow");
                result = 0;                           //         }
                break;                                //          return (int)r;
            }                                         //     }
            r = result;
        }
        return (int)result;
    }

    /**
     *
     * @param number
     * @param result
     * @return
     */
    public static String format(int number){
        int result = countFactorial(number);
        String str = "";
        for (int i = 1; i <= number; i++) {
            str += i;
            if(i != number){
                str += " * ";
            }
        }
        str += " = " + result;
        return str;
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
            } catch (NumberFormatException nfe1) {
                return false;
        }
    }
}
