package examples.searchNumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerchNumbersRegex {

    public static int searchNumberRegEx(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
