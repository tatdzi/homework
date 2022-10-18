package home_work_last;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyRanable implements Runnable{
    private File file;
    private String word;

    public MyRanable(File file,String word) {
        this.file = file;
        this.word = word;
    }

    @Override
    public void run() {
        EasySearch easySearch = new EasySearch();
        long count = easySearch.search(Operation.fileToString(file),this.word);
        File file = new File("homework\\src\\home_work_last\\files\\result.txt");
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write(this.file.getName()+", Слово : "+this.word+" Количество : "+count+"\n");
            writer.close();
        }catch (IOException e){
            e.getMessage();
        }
    }
}
