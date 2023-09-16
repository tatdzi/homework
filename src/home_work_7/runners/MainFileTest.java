package home_work_7.runners;

import home_work_7.Book;
import home_work_7.WriterResult;
import home_work_7.api.IBook;
import home_work_7.api.ISearchEngine;
import home_work_7.api.IWriterResult;
import home_work_7.dto.Word;
import home_work_7.searchers.EasySearch;
import home_work_7.searchers.EasySearchNextLevel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ISearchEngine es = new EasySearchNextLevel();
        IWriterResult writerResult = new WriterResult("homework/src/home_work_7/files");
        File root = new File(args[0]);
        while (!root.isDirectory()){
            System.out.println("Введите верный адрес директории!");
            root = new File(input.nextLine());
        }
        File[] files = root.listFiles();
        List<File> filesTex = new ArrayList<>();
        int number = 1;
        assert files != null;
        for (File file:files){
            if (file.getName().endsWith(".txt")){
                System.out.println(number+". "+file.getName());
                filesTex.add(file);
                number++;
            }
        }
        boolean bookNext = true;
        while (bookNext){
            System.out.println("Введите номер книги для поиска!");
            while (!input.hasNextInt()){
                System.out.println("Вы весли несуществующий номер книги, попробуйте снова!");
                input.next();
            }
            int point = input.nextInt();
            boolean wordNext = true;
            while (wordNext) {
                System.out.println("Введите слово которое хотите найти!\nЕсли хотите вернуться к выбору книги пишите: false");
                if (input.hasNextBoolean()){
                    wordNext = input.nextBoolean();
                    break;
                }
                String word = input.next();

                File book = new File(filesTex.get(point - 1).toURI());
                IBook b = new Book(book);
                String text = b.toString();
                long counter = es.search(text, word);
                Word result = new Word(word,counter);
                writerResult.write(book,result);
            }
            System.out.println("Хотите поискать слова в других книгах? true/false");
            while (!input.hasNextBoolean()){
                System.out.println("вы ввели что-то неправильно! Попробуйте еще раз!");
                input.next();
            }
            bookNext = input.nextBoolean();
        }
        System.out.println("Конец");
    }
}
