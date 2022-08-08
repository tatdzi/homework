package home_work_1;

import java.util.Scanner;

public class SleepOrNot {

    public static void main(String[] args) {
        boolean weekday,vacation;
        Scanner in = new Scanner(System.in);
        System.out.println("Сегодня рабочий день? true/false");
        weekday = in.nextBoolean();
        System.out.println("Вы в отпуске? true/false");
        vacation =in.nextBoolean();

        if (sleepIn(weekday,vacation)){
            System.out.println("Сегодня можно и поспать....");
        }else {
            System.out.println("Пора собираться на работу!");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday){
            return true;
        }else {
            return false;
        }
    }
}
