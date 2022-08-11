package home_work_2.loops;

import home_work_1.AverageNumberSearch;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        int degree;
        double number,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число!");
        while (!(in.hasNextDouble())){
            System.out.println("Выввели неправильные данные!" +
                    "\nПопробуйте снова!");
            in.next();
        }
        number =in.nextDouble();
        System.out.println("Введите второе число!");
        //Проверка положительное ли число.
        if ((degree = AverageNumberSearch.enterAndChackInt(in)) < 0) {
            System.out.println("Ввенное число отрицательное!" +
                    "\nПопробуйте еще раз!");
            degree = AverageNumberSearch.enterAndChackInt(in);
        }
        result = inDegree(number,degree);
        System.out.println(number+" ^ "+degree+" = "+ new DecimalFormat( "###,###.0#" ).format(result));
    }

    /**
     * Метод inDegree возводит число в степень.
     * @param a число
     * @param b степень
     * @return результат возведения
     */
    public static double inDegree(double a,int b){
        double res = 1;
        while (b>0){
            res *= a;
            --b;
        }
        return res;
    }
}
