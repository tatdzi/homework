package home_work_7;

import home_work_7.api.IBook;
import home_work_7.dto.Word;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Book implements IBook {
    private File file;
    private String text;
    private Set<String> words = new HashSet<>();
    private Map<String,Long> wordsAndCount = new HashMap<>();

    public Book(File file) {
        this.file = file;
        StringBuilder textBuilder = new StringBuilder();
        StringBuilder wordBuilder = new StringBuilder();

        try (Reader reader = new FileReader(this.file, Charset.forName("Windows-1251"))){
            int symbol;

            while ((symbol = reader.read()) != -1){
                textBuilder.append((char) symbol);

                if (Character.isLetter(symbol) || (char)symbol == '-'){
                    wordBuilder.append((char)symbol);
                } else if (!wordBuilder.isEmpty()) {
                    wordsAndCount.merge(wordBuilder.toString(),1L, Long::sum);
                    wordBuilder = new StringBuilder();
                }
            }
            wordsAndCount.remove("-");
            text = textBuilder.toString();
            words = wordsAndCount.keySet();

        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.fillInStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public String getBookName() {
        return this.file.getName();
    }

    @Override
    public Set<String> getSetOfWords() {
        return words;
    }

    @Override
    public Map<String, Long> getMapOfWords() {
        return wordsAndCount;
    }

    @Override
    public List<Word> topN(int number) {
        List<Word> words = new ArrayList<>();
        List<Word> result = new ArrayList<>();
        for (String word:wordsAndCount.keySet()){
            words.add(new Word(word,wordsAndCount.get(word)));
        }
        words.sort((o1,o2)-> (int) (o2.getCount()-o1.getCount()));
        for (int i = 0 ; i < number ; i++){
            result.add(words.get(i));
        }
        return result;
    }

    @Override
    public long search(String word) {
        return wordsAndCount.get(word);
    }
}
