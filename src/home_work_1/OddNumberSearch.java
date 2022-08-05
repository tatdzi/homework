package home_work_1;

import java.util.Scanner;
public class OddNumberSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number1,number2;
        number1 = (int)(Math.random()*100);
        System.out.println("Первое случайное число : "+number1);
        number2 = (int)(Math.random()*100);

        while (!((number1 % 2 == 0 && number2 % 2 != 0) || (number1 % 2 != 0 && number2 % 2 == 0))){
            number2 = (int)(Math.random()*100);
        }
        System.out.println("Второе случайное число : "+number2);

        if (number1 % 2 == 0){
            System.out.println(number2+" - нечетное число!");
        }else {
            System.out.println(number1+" - нечетное число!");
        }
    }
}
