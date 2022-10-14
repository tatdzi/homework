package home_work_2.loops;

import home_work_1.AverageNumberSearch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_1_4 {

    public static Long overFlow(int number){
        long a = 1;
        long b = a;
        while (true){
            a *= number;
            if (!(a/number == b)){
                break;
            }
            b *=number;
        }
        return b;
    }
}
