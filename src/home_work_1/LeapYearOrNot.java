package home_work_1;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год, который вас интересует!");
        int year = in.nextInt();

        if (!(year % 4 == 0)) {
            System.out.println("Это не високосный год!");
        }else if (year % 100 != 0){
            System.out.println("Это високосный год!");
        }else if (year % 400 == 0){
                System.out.println("Это високосный год!");
            }else {
                System.out.println("Это не високосный год!");
            }
    }
}
