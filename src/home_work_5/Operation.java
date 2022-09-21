package home_work_5;

import home_work_5.api.IGenerator;
import home_work_5.api.dto.Animal;
import home_work_5.api.dto.Person;

import java.util.List;
import java.util.Set;

public class Operation {
    private long checkTime;


    public void addPerson(IGenerator generator, List<Person> people, int count){
        long start = System.currentTimeMillis();
        for (int i = 0; i<count; i++){
            people.add(new Person(
                    generator.randomGenerator(),
                    generator.randomGenerator(generator.intGenerator(5,10)),
                    generator.randomGenerator()
            ));
        }
        this.checkTime = System.currentTimeMillis() - start;
    }


    public void addAnimal (IGenerator generator, Set<Animal> animal, int count){
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            animal.add(new Animal(
                    generator.intGenerator(1, 15),
                    generator.randomGenerator()
            ));
        }
        this.checkTime = System.currentTimeMillis() - start;
    }

    public long getCheckTime() {
        return checkTime;
    }
}
