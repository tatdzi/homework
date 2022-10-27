package home_work_7.searchers;

import home_work_7.api.ISearchEngine;

public class EasySearchNextLevel implements ISearchEngine {

    private static final char[] allowChaars =
            {' ','!','.',',','-',':','?','%','"',';'};

    @Override
    public long search(String text, String word) {
        if (text.length()<word.length()){
            return 0;
        }
        if ("".equals(word)||word.contains(" ")){
            return 0;
        }
        long counte = 0;
        int index = 0;
        while ((index = text.indexOf(word,index)) != -1) {
            if (checkWordAround(text,word,index)){
                counte++;
            }
            index += word.length();
        }
        return counte;
    }

    /**
     * Подходит линам это слово
     * @param text текст в котором ищем слово
     * @param word слово которое ищем
     * @param index позиция в которой нашли слово
     * @return подходит ли
     */
    private boolean checkWordAround(String text, String word, int index){
        boolean needCheckBefore = index != 0;
        boolean needCheckAfter = ((index + word.length()) != text.length());

        if (!needCheckBefore && !needCheckAfter){
            return true;
        }
        if (needCheckBefore && specialBeforeAllow(text,index) && isAllowCharacter(text.charAt(index-1)) ){
            return true;
        }
        if (needCheckAfter && specialAfterAllow(text,index + word.length()) && isAllowCharacter(text.charAt(index+word.length()))){
            return true;
        }
        return false;
    }

    private  boolean specialBeforeAllow(String text, int index){
        if (text.charAt(index-1) == '-'){
            if ((index - 2) > -1 && !isAllowCharacter(text.charAt(index -2))){
                return false;
            }
        }
        return true;
    }
   private boolean specialAfterAllow(String text,int index){
        char c = text.charAt(index);
        if (c == '-'){
            int afretCharIndex = index + 1;
            if(afretCharIndex < text.length() && !isAllowCharacter(text.charAt(afretCharIndex))){
                return false;
            }
        }
        return true;
   }
   private boolean isAllowCharacter(char c){
        for (char allowChar : allowChaars){
            if (allowChar == c){
                return true;
            }
        }
        return  false;
   }
}
