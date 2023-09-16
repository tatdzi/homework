package examples.searchNumbers;

public class SearchNumbers {
    public static int countNumber(String text){
        int counter = 0;
        char[] arrayOfSumble = text.toCharArray();
        for (char element: arrayOfSumble) {
            if (Character.isDigit(element)){
                counter++;
            }
        }
        return counter;
    }
}
