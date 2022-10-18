package home_work_last;

import home_work_last.dto.Word;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;
import java.util.List;

public class Operation {

    /**
     * Метод проверяет является ли символ буквой русского или английского алфавита
     * @param letter - символ
     * @return true - если является буквой, folse - если не являетя буквой
     */
    public static boolean isLetter(int letter){
        return 65 <= letter && letter <= 90 ||
                97 <= letter && letter <= 122 ||
                1040 <= letter && letter <= 1103 ||
                1105 == letter ||
                1125 == letter;
    }

    /**
     * Метод преобразует данные файла в строку
     * @param file - файл который хотим преобразовать
     * @return String - преобразованный файл
     */
    public static String fileToString(File file){
        StringBuilder result = new StringBuilder();
        String line = null;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(file,Charset.forName("Windows-1251")))){

            while ((line = reader.readLine()) != null) result.append(line);

        }catch (FileNotFoundException e){
            e.getMessage();
        }catch (IOException f){
            f.printStackTrace();
        }
        return result.toString();
    }
    /**
     * Метод преобразует данные файла в строку
     * @param file - файл который хотим преобразовать
     * @return String - преобразованный файл
     */
    public static String fileToString1(File file){
        StringBuilder result = new StringBuilder();
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(file.toPath());
            for (String line:text) result.append(line);

        }catch (FileNotFoundException e){
            e.getMessage();
        }catch (IOException f){
            f.printStackTrace();
        }
        return result.toString();
    }

    /**
     * метод находит слова в файле и вносит их в коллекцию
     * @param file - файл
     * @return коллекция слов.
     */

    public static Set<String> getSetForWords(File file) {
        Map<String,Long> map = Operation.getMapOfWords(file);
        return map.keySet();
    }


    public static List<Word> topN(int top, File file){
        Map<String,Long> map = Operation.getMapOfWords(file);
        List<Word> words = new ArrayList<>();
        for (String word:map.keySet()){
            words.add(new Word(word,map.get(word)));
        }
        Comparator<Word> comp = (o1,o2)-> (int) (o2.getCount()-o1.getCount());
        words.sort(comp);
        List<Word> result = new ArrayList<>();
        for (int i = 0 ; i<top ; i++){
            result.add(words.get(i));
        }
    return result;

    }
    public static List<Word> topN1(int top, File file) {
        Map<String,Long> map = Operation.getMapOfWords(file);
        List<Map.Entry<String, Long>> words = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<String, Long>> comp =(o1,o2)-> (int) (o2.getValue() - o1.getValue());
        words.sort(comp);
        List<Word> result = new ArrayList<>();
        for (int i = 0 ; i < top ; i++){
            Map.Entry<String, Long> word = words.get(i);
            result.add(new Word(word.getKey(),word.getValue()));
        }
        return result;
    }

    /**
     * метод получает файл и отдает мапу использованных слов в виде ключа
     * и количества раз использований в качестве значения
     * @param file - файл
     * @return - мапа
     */
    public static Map<String,Long> getMapOfWords(File file) {
        String text = fileToString(file);
        Map<String, Long> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char numder;
            if (isLetter(numder = text.charAt(i))) {
                builder.append(numder);
            } else if (!builder.isEmpty()) {

                if (map.get(builder.toString()) == null) {
                    map.put(builder.toString(), 1L);
                }else {
                    Long count = map.get(builder.toString());
                    map.put(builder.toString(), ++count);
                    builder = new StringBuilder();
                }
            }
        }
        return map;
    }


    public static long search(File file, String word) {
        Map<String,Long> map = Operation.getMapOfWords(file);
        if (map.get(word)!=null) {
            return map.get(word);
        }else {
            return 0;
        }
    }
}
