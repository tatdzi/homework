package home_work_2.loops;

import home_work_1.AverageNumberSearch;

import java.util.Scanner;

public class Task_1_4 {
    public static void main(String[] args) {
        long before,after;
        long a = 1;
        long b = a;
        Scanner in = new Scanner(System.in);
        System.out.println("На какое число будем умножать?");
        int number = AverageNumberSearch.enterAndChackInt(in);
        while (true){
            a *= number;
            if (!(a/number == b)){
                break;
            }
            b *=number;
        }
        System.out.println(b+" До переполнения!");
        System.out.println(a+" После переполнения!");
    }
}
