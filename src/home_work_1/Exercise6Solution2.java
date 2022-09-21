package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Exercise6Solution2 implements ICommunicationPrinter {
    public String welcom(String name){
        String nameV = "Вася";
        String nameA = "Анастасия";
        String answer = "";
        if(Objects.equals(name,nameV)){
            answer += "Привет! Я тебя так долго ждал";
        } else if (Objects.equals(name,nameA)) {
            answer += "Я тебя так долго ждал";
        }else{
            answer += "Добрый день, а вы кто?";
        }
        return answer;
    }
}
