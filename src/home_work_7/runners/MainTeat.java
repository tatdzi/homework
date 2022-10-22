package home_work_7.runners;

import home_work_7.Book;
import home_work_7.api.IBook;
import home_work_7.api.ISearchEngine;
import home_work_7.dto.Word;
import home_work_7.searchers.EasySearch;
import home_work_7.searchers.RegExSearch;

import java.io.File;
import java.util.List;

public class MainTeat {
    public static void main(String[] args) {
        File file = new File("homework/src/home_work_last/files/4. Колдун и кристалл (пер.В.А.txt");
        long start = System.currentTimeMillis();
        IBook book = new Book(file);
        System.out.println(System.currentTimeMillis()-start);
        List<Word> wordList = book.topN(10);
        for (Word word:wordList){
            System.out.println(word.toString());
        }
        ISearchEngine es1 = new EasySearch();
        ISearchEngine es2 = new RegExSearch();
        long i1 = es1.search(book.toString(),"и");
        long i2 = es2.search(book.toString(),"и");
        System.out.println(i1);
        System.out.println(i2);

    }
}
