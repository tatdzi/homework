package home_work_last;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        long counret = 0;
        int value = 0;
        while (true) {
            value = text.indexOf(word, value);
            if (value == -1 ){
                break;
            }else if (!Operation.isLetter(text.charAt(value - 1)) && !Operation.isLetter(text.charAt(value + word.length()))) {
                counret++;
                value ++;
            }else {
                value ++;
            }
        }
        return counret;
    }
}
