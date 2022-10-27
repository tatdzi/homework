package home_work_7;

import home_work_7.api.IBook;
import home_work_7.searchers.EasySearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyRunnable implements Runnable {
    private File file;
    private String word;

    public MyRunnable(File file,String word) {
        this.file = file;
        this.word = word;
    }

    @Override
    public void run() {
        EasySearch easySearch = new EasySearch();
        IBook book = new Book(this.file);
        long count = easySearch.search(book.toString(),this.word);
        File file = new File("homework\\src\\home_work_7\\files\\result.txt");

        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write(this.file.getName()+", Слово : "+this.word+" Количество : "+count+"\n");
            writer.close();
        }catch (IOException e){
            e.getMessage();
        }
    }
}
