package home_work_1;

import java.util.Scanner;

public class TestDivisibleOrNot {
    public static void main(String[] args) {

        int number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число от 0 до 100!");
        number1 = in.nextInt();
        System.out.println("Введите второе число от 0 до 100!");
        number2 = in.nextInt();
        System.out.println(testDivisibleOrNot(number1,number2));
    }
    public static String testDivisibleOrNot(int number1, int number2){
        int result = number1 / number2;
        int remainder = number1 % number2;
        if (number1 % number2 == 0 ){
            return "Число "+number1+" делится на число "+number2+"\nЧастное равно : "+result;
        }else {
            return "Число "+number1+" не делится на число "+number2+"\nЧастное равно : "+result+"\nОстаток равен : "+remainder;
        }
    }
}
