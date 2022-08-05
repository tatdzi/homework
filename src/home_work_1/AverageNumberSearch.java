package home_work_1;

import java.util.Scanner;

public class AverageNumberSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа через enter!");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b) {
            if (a < c) {
                System.out.println("Среднее число " + a);
            } else if (c > b) {
                System.out.println("Среднее число " + c);
            } else {
                System.out.println("Среднее число " + b);
            }
        }else if (b < c){
            System.out.println("Среднее число " + b);
        }else if (a < c){
            System.out.println("Среднее число " + c);
        }else {
            System.out.println("Среднее число " + a);
        }

    }
}
