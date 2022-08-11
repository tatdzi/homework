package home_work_2.loops;

import home_work_1.AverageNumberSearch;
import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {
        int number, result, a;
        String R, I;
        String Result = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число!");
        //Проверка положительное ли число.
        if ((number = AverageNumberSearch.enterAndChackInt(in)) < 0) {
            System.out.println("Ввенное число отрицательное!" +
                    "\nПопробуйте еще раз!");
            number = AverageNumberSearch.enterAndChackInt(in);
        }
        result = operation(number);
        while (number>0){
            a = number % 10;
            I = Integer.toString(a);
            Result =I+Result;
            number /= 10;
            if (number%10 == 0){
                if (number > 0) {
                    Result =" * "+Result;
                }else {
                    Result =Result+" = ";
                }
            }else {
                Result =" * "+Result;
            }
        }
        R = Integer.toString(result);
        System.out.println(Result+R);

    }
    /**
     * Метод operation Перемножает все цифры числа
     * @param z число
     * @return Произведение цифр числа.
     */
    public static int operation(int z){
        int a;
        int result = 1;
        do {
            a = z % 10;
            result *= a;
            z /= 10;
        }while (z > 0);
        return  result;
    }
}
