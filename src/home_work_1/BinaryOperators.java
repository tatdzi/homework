package home_work_1;

import java.util.Scanner;

public class BinaryOperators {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите двухзначное число a !");
        byte a = in.nextByte();
        System.out.println("Введите двухзначное число b !");
        byte b = in.nextByte();                                             //for example
                                                                            //a=10    0 0 0 0  1 0 1 0
                                                                            //b=23    0 0 0 1  0 1 1 1
        System.out.println("Побитовая операция И a & b = "+ (a & b));       //И=2     0 0 0 0  0 0 1 0
        System.out.println("Побитовая операция ИЛИ a | b = "+ (a | b));     //ИЛИ=31  0 0 0 1  1 1 1 1

        //System.out.println("Побитовая операция ИЛИ a | 42.5 = "+ (a | 42.5));

        //java: bad operand types for binary operator '|'
        //first type:  byte
        //second type: double

        //Число 42.5 имеет тип double, Побитовые операторы могут быть применены только к целочисленным типам.

    }
}
