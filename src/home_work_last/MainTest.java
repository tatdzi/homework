package home_work_last;

import home_work_last.dto.Word;

import java.io.File;
import java.util.List;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {
        File file = new File("homework\\src\\home_work_last\\files\\4. Колдун и кристалл (пер.В.А.txt");
        List<Word> e = Operation.topN1(10,file);
        List<Word> top = Operation.topN(10,file);
        for (Word word:e){
            System.out.println(word.toString());
        }
        System.out.println("______________________");
        for (Word word:top){
            System.out.println(word.toString());
        }
        ;


    }
}
