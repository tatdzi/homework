package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class NickGenerator  implements IGenerator {
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();

    public NickGenerator() {
    }

    @Override
    public String generate() {
        int count = rnd.nextInt(10);
        String[] str={"Боба","Блэк","Синька","Сунька","Пират","Бони","Киллер","Феня","Гав","Эдик"};
        return str[count];
    }
}
