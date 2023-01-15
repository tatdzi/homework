package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class StringRusGenerator implements IGenerator {

    private ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private int from;
    private int to;

    public StringRusGenerator() {
        this.from = 3;
        this.to = 20;
    }
    public StringRusGenerator(int count) {
        this.from = count;
        this.to = count;
    }
    public StringRusGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public String generate() {
        int count = this.rnd.nextInt(this.from,this.to+1);
        String str="абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<count;i++){
            int number=rnd.nextInt(str.length()-1);
            builder.append(str.charAt(number));
        }
        return builder.toString();
    }
}
