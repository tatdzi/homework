package home_work_1;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год, который вас интересует!");
        int year = in.nextInt();
        System.out.println(leapYearOrNot(year));
    }
    public static String leapYearOrNot(int year){
        if (!(year % 4 == 0)) {
            return "Это не високосный год!";
        }else if (year % 100 != 0){
            return "Это високосный год!";
        }else if (year % 400 == 0){
            return "Это високосный год!";
        }else {
            return "Это високосный год!";
        }
    }
}
