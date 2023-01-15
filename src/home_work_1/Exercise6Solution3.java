package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Exercise6Solution3 implements ICommunicationPrinter {

    public String welcom(String name) {
        String nameV = "Вася";
        String nameA = "Анастасия";
        String answer = "";
        switch (name) {
            case ("Вася"):
                answer += "Привет! ";
            case ("Анастасия"):
                answer += "Я тебя так долго ждал";
                break;
            default:
                answer += "Добрый день, а вы кто?";
        }
        return answer;
    }
}
