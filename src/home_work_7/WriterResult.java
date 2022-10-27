package home_work_7;

import home_work_7.api.IWriterResult;
import home_work_7.dto.Word;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterResult implements IWriterResult {
    File file;
    int counterRequests = 0;

    public WriterResult(String addres) {
        this.file = new File(addres+"/result.txt");
        if (file.delete()){
            file = new File("homework\\src\\home_work_7\\files\\result.txt");
        }
    }
    public void write(File book, Word word){
        this.counterRequests++;
        try (FileWriter writer = new FileWriter(this.file, true)){
            writer.write(counterRequests+". Книга: "+book.getName()+", Слово : "+word.getName()+" Количество : "+word.getCount()+"\n");
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
