package home_work_7.runners;

import home_work_7.MyRunnable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


    public class MainThread {
        public static void main(String[] args) {
            ExecutorService es = Executors.newFixedThreadPool(1);
            Scanner in = new Scanner(System.in);
            File book;
            try {
                book = new File(args[0]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Укажите путь к директории");
                book = new File(in.next());
            }
            List<MyRunnable> words = new ArrayList<>();
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
            boolean getWord = true;
            long start = 0;
            long finish = 0;
            String word = null;
            while (getWord) {
                System.out.println("Что хотите найти?");
                word = in.next();
                for (File file:files){
                    words.add(new MyRunnable(file,word));
                }
                System.out.println("Если хочешь еще что-то найти, пиши true\nЕсли нет, пиши - false");
                getWord = in.nextBoolean();
            }

            start = System.currentTimeMillis();
            for (MyRunnable ranable:words){
                es.submit(ranable);
            }

            es.shutdown();
            finish = System.currentTimeMillis();

            System.out.println(finish-start);
//        File file = new File("homework\\src\\home_work_last\\files\\result.txt");
//        System.out.println(Operation.fileToString(file));
            System.out.println("Завершение работы....");
        }
    }

