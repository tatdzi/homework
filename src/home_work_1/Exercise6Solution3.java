package home_work_1;

import java.util.Scanner;

public class Exercise6Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String nameIn = in.nextLine();
        String nameV = "Вася";
        String nameA = "Анастасия";

        switch (nameIn) {
            case ("Вася"):
                System.out.println("Привет!");
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
