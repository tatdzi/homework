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
            double result = calc.calcs(in.next());  // Может считать примеры такого вида : ((2+3)-(2+(4-2))/2)+5 ; (2^4)*((3-2)+2)
            System.out.println("Результат вырожения : " + result);      // Имеется проблемма при вводе через консоль с пробелами( выдает ошибку , без пробелов все ок)
            System.out.println("Хотите решить еще один пример? true/false");
            next = in.nextBoolean();
        }
    }
}
