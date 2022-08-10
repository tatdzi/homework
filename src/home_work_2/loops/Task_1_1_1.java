package home_work_2.loops;

import home_work_1.AverageNumberSearch;

import java.util.Scanner;

public class Task_1_1_1 {
    public static void main(String[] args) {
        int number;
        String result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число!");
        if ((number = AverageNumberSearch.enterAndChackInt(in)) < 0){
            System.out.println("Ввенное число отрицательное!" +
                    "\nПопробуйте еще раз!");
            number = AverageNumberSearch.enterAndChackInt(in);
        }
        result = countFactorial(number);
        System.out.println(result);
    }
    public static String countFactorial(int f){
        String F,I,R;
        int result = 1;
        int i = 1;
        F = Integer.toString(i);
        for (i = 2;i <= f;++i){
            I =Integer.toString(i);
            F += " * "+I;
            result *= i;
            if (result < 0){
                F += "(Тратата, int уже переполнен!)";
                break;
            }
        }
        R = Integer.toString(result);
        F +=" = "+R;
        return F;
    }
}
