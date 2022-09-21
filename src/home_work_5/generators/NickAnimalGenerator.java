package home_work_5.generators;

import home_work_5.api.IGenerator;

public class NickAnimalGenerator extends SimpleGenerator implements IGenerator {
    @Override
    public String randomGenerator() {
        int count = rnd.nextInt(10);
        String[] str={"Боба","Блэк","Синька","Сунька","Пират","Бони","Киллер","Феня","Гав","Эдик"};
        return str[count];
    }
}
