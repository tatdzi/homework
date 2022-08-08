package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Exercise6Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String nameIn = in.nextLine();
        String nameV = "Вася";
        String nameA = "Анастасия";

        if(Objects.equals(nameIn,nameV)){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }else if (Objects.equals(nameIn,nameA)){
            System.out.println("Я тебя так долго ждал");
        }else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
