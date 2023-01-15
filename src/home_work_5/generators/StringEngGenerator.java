package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class StringEngGenerator implements IGenerator {
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private int from;
    private int to;

    public StringEngGenerator() {
        this.from = 3;
        this.to = 20;
    }
    public StringEngGenerator(int count) {
        this.from = count;
        this.to = count;
    }
    public StringEngGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public String generate() {
        int count = this.rnd.nextInt(this.from,this.to+1);
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<count;i++){
            int number=rnd.nextInt(str.length()-1);
            builder.append(str.charAt(number));
        }
        return builder.toString();
    }
}
