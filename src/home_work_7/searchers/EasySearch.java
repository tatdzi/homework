package home_work_7.searchers;

import home_work_7.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long counter = 0;
        int index = 0;
        while (true) {
            index = text.indexOf(word, index);
            if (index == -1) {
                break;
            }else if (!Character.isLetter(text.charAt(index - 1))&& !Character.isLetter(text.charAt(index + word.length()))) {
                counter++;
            }
            index += word.length();
           }
        return counter;
    }
}
