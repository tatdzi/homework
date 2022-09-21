package home_work_5.comparators;

import home_work_5.api.dto.Animal;
import home_work_5.api.dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class PersonComparatorTest {

    @Test
    void compareTest1(){
        Comparator<Person> cp = new PersonComparator();
        Person person1 = new Person("Пчела","1234","Вася");
        Person person2 = new Person("Ачела","1234","Антон");
        Assertions.assertEquals(-15,cp.compare(person1,person2));
    }
    @Test
    void compareTest2(){
        Comparator<Animal> ca = new AnimalComporator();
        Animal animal1 = new Animal(1,"Вася");
        Animal animal2 = new Animal(10,"Антон");
        Assertions.assertEquals(9,ca.compare(animal1,animal2));
    }

}
