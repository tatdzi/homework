package home_work_last;

import home_work_last.dto.Word;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        EasySearch easySearch = new EasySearch();
        Scanner in = new Scanner(System.in);
        File book;
        try {
            book = new File(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Укажите путь к директории");
            book = new File(in.next());
        }
        while (!book.isDirectory()){
            System.out.println("Укажите правильный путь к директории");
            book = new File(in.next());
        }
        File[] files = book.listFiles();
        assert files != null;
        int i = 0;
        for (File file:files){
            System.out.println((i+1)+".  "+file.getName());
            i++;
        }
        boolean getBook = true;
        while (getBook) {
            System.out.println("Введите номер желаемой книги!");
            int number = in.nextInt();
            while (!(number > 0 && number < files.length + 1)) {
                System.out.println("что-то пошло не так, попробуйте еще раз!");
                number = in.nextInt();
            }
            boolean getWord = true;
            while (getWord) {
                System.out.println("Что хотите найти?");
                String word = in.next();
                File root = files[number - 1];
                String text = Operation.fileToString(root);
                System.out.println(text.length());
                long count = easySearch.search(text, word);
                System.out.println("Нейдено " + count + " слов");
                crea(root.getName(),new Word(word,count));
                System.out.println("Если хочешь еще что-то найти, пиши true\nЕсли нет, пиши - false");
                getWord = in.nextBoolean();
            }

            System.out.println("Если хочешь поискать в другой книге, пиши - true\n" +
                    "Если хочешь вывести результат поисков и завершитть работу пиши - false");
            getBook = in.nextBoolean();
        }
        File file = new File("homework\\src\\home_work_last\\files\\result.txt");
        System.out.println(Operation.fileToString(file));
        System.out.println("Завершение работы....");



    }

    public static void crea(String book,Word word) {
        File file = new File("homework\\src\\home_work_last\\files\\result.txt");
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write(book+", Слово : "+word.getName()+" Количество : "+word.getCount()+"\n");
            writer.close();
        }catch (IOException e){
            e.getMessage();
        }
    }

}
