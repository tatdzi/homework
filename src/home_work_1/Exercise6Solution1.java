package home_work_1;

import java.util.Scanner;
import java.util.Objects;

public class Exercise6Solution1 implements ICommunicationPrinter {

    public String welcom(String name){
        String nameV = "Вася";
        String nameA = "Анастасия";
        String answer = "";
        if(Objects.equals(name,nameV)){
            answer += "Привет! ";
        }
        if (Objects.equals(name,nameV) || Objects.equals(name,nameA)) {
            answer += "Я тебя так долго ждал";
        }else{
            answer += "Добрый день, а вы кто?";
        }
        return answer;
    }

}
