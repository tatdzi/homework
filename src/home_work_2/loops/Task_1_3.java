package home_work_2.loops;

import home_work_1.AverageNumberSearch;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_1_3 {

    public static String format(double number, int degree, double result){
        return number+" ^ "+degree+" = "+ new DecimalFormat( "###,###.0#" ).format(result);
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
