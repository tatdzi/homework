package home_work_5.generators;

import home_work_5.api.IGenerator;

public class NameGenerator extends SimpleGenerator implements IGenerator {
    @Override
    public String randomGenerator() {
        int count = rnd.nextInt(10);
        String[] str={"Илья","Денис","Дима","Паша","Саша","Маша","Юля","Катя","Толя","Эдик"};
        return str[count];
    }
}
