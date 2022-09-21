package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleGenerator implements IGenerator {
    protected ThreadLocalRandom rnd = ThreadLocalRandom.current();
    @Override
    public String randomGenerator() {
        int count = this.rnd.nextInt(6,21);
        StringBuilder builder = new StringBuilder();
        for (int i = 1;i<=count;i++){
            builder.append(this.rnd.nextInt(10));
        }
        return builder.toString();
    }

    public String randomGenerator(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i<count;i++){
            builder.append(this.rnd.nextInt(10));
        }
        return builder.toString();
    }
    public int intGenerator(int from, int to){
        return this.rnd.nextInt(from,to+1);
    }
}
