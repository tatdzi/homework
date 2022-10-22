package home_work_7.api;

import home_work_7.dto.Word;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IBook {
    String toString();
    String getBookName();
    Set<String> getSetOfWords();
    Map<String,Long> getMapOfWords();
    List<Word> topN(int number);
    long search(String word);
}
