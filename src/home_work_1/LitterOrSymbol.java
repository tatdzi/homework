package home_work_1;

import java.util.Scanner;

public class LitterOrSymbol {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число!");
        int number = in.nextInt();
        System.out.println(litterOrSymbol(number));
    }
    public static String litterOrSymbol(int number){
        char litterOrSymbol = (char) number;
        if ((number >= 65 && number <= 90) || (number >= 97 && number <= 122)) {
            return "Вы ввели номер буквы : " + litterOrSymbol;
        }else {
            return "Вы ввели номер символа : " + litterOrSymbol;
        }
    }
}
