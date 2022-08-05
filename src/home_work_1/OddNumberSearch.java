package home_work_1;

import  java.util.Scanner;

public class OddNumberSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        byte number;
        System.out.println("Введите число от 0 до 100!");
        number = in.nextByte();

        while (!(number >= 0 && number <= 100)) {
            System.out.println("Введенное число не соответствует требованиям, ввдите новое число!");
            number = in.nextByte();
        }
        if (number%2 == 0){
            System.out.println("Вы ввели четное число.");
        }else {
            System.out.println("Вы ввели нечетное число.");
        }

    }
}
