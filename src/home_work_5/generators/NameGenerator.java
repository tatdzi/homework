package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class NameGenerator implements IGenerator {

    private ThreadLocalRandom rnd = ThreadLocalRandom.current();

    public NameGenerator() {
    }
    @Override
    public String generate() {
        int count = rnd.nextInt(10);
        String[] str={"Илья","Денис","Дима","Паша","Саша","Маша","Юля","Катя","Толя","Эдик"};
        return str[count];
    }
}
