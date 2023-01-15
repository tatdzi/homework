package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator implements IGenerator {
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private int from;
    private int to;

    public NumberGenerator() {
        this.from = 3;
        this.to = 20;
    }
    public NumberGenerator(int count) {
        this.from = count;
        this.to = count;
    }
    public NumberGenerator(int from, int to) {
       this.from = from;
       this.to = to;
    }

    @Override
    public String generate() {
        int count = this.rnd.nextInt(this.from,this.to+1);
        StringBuilder builder = new StringBuilder();
        for (int i = 1;i<=count;i++){
            builder.append(this.rnd.nextInt(10));
        }
        return builder.toString();
    }


}
