package home_work_2.loops;

import home_work_1.AverageNumberSearch;
import java.util.Scanner;

public class Task_1_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number,result;

        if (args.length==0){
            System.out.println("Нет аргумента!\nВведите аргумент!");
            number = AverageNumberSearch.enterAndChackInt(in);
        }else {
            boolean check = checkArgs(args[0]);
            if (!check){
                System.out.println("Введите аргумент!");
                number = AverageNumberSearch.enterAndChackInt(in);
            }else{
                number = Integer.parseInt(args[0]);
            }
        }
        while (true) {
            System.out.println("Ваш аргумент : " + number);
            result = countFactorial(number);
            if (result == 0) {
                System.out.println("Вы выбрали слишком большоеч число" +
                        "\nПеременная переполнена и не может отразить результат! \n Введите аргумент!");
                number = AverageNumberSearch.enterAndChackInt(in);
            }else {
                break;
            }
        }
        String Result = format(number,result);
        System.out.println(Result);
    }

    /**
     * Метод countFactorial вычисляет факториал целочисленного числа с помощью
     * цикла и проверяет его на переполнение.
     * @param f Число для которого нужно посчитать факториал.
     * @return Возвращает результат вычисления, если происходит переполнение возвращает 0.
     */
    public static int countFactorial(int f){
        long r = 1;                                   // Проверка на переполнение int
        long result=0;                                //public static int multiplyExact(int x, int y) {
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
    public static String format(int number,int result){
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
            try {
                Double.parseDouble(a);
                System.out.println("Введено не целое число");
                return false;
            } catch (NumberFormatException nfe2) {
                System.out.println("Введено не число!");
                return false;
            }
        }
    }
}
