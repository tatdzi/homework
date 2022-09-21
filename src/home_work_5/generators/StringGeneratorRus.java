package home_work_5.generators;

import home_work_5.api.IGenerator;
import home_work_5.generators.SimpleGenerator;

public class StringGeneratorRus extends SimpleGenerator implements IGenerator {
    @Override
    public String randomGenerator() {
        int count = rnd.nextInt(6,21);
        String str="абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<count;i++){
            int number=rnd.nextInt(str.length()-1);
            builder.append(str.charAt(number));
        }
        return builder.toString();
    }

    @Override
    public String randomGenerator(int count) {
        String str="абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<count;i++){
            int number=rnd.nextInt(str.length()-1);
            builder.append(str.charAt(number));
        }
        return builder.toString();
    }
}
