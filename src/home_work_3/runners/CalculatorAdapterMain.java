package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorAdapter;

import java.util.Scanner;

public class CalculatorAdapterMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalculatorAdapter calc = new CalculatorAdapter();
        boolean next = true;
        while (next){
            System.out.println("Введите пример для решения:");
            double result = calc.calcs(in.next());
            System.out.println("Результат вырожения : " + result);
            System.out.println("Хотите решить еще один пример? true/false");
            next = in.nextBoolean();
        }
    }
}
