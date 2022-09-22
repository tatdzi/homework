package home_work_5;

import home_work_5.api.IGenerator;
import home_work_5.comparators.AnimalComporator;
import home_work_5.comparators.PersonComparator;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.generators.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        IGenerator generator1 = new NameGeneratorFromFile();
        IGenerator generator2 = new NickGeneratorFromFile();
        IGenerator generator3 = new NumberGenerator(5,10);
        Comparator<Person> cp = new PersonComparator();
        Comparator<Animal> ca = new AnimalComporator();
        List<Person> people1 = new ArrayList<>();
        List<Person> people2 = new ArrayList<>();
        Set<Animal> animals3 = new HashSet<>();
        Set<Animal> animals4 = new TreeSet<>(ca);
        operation.addPerson(generator2,generator3,generator1,people1,100000);
        System.out.println(operation. lastOperatio());
        operation.addPerson(generator2,generator3,generator1,people2,100000);
        System.out.println(operation. lastOperatio());
        operation.addAnimal(generator2,animals3,1000);
        System.out.println(operation. lastOperatio());
        operation.addAnimal(generator2,animals4,1000);
        System.out.println(operation. lastOperatio());
        operation.sortJDK(people1,cp);
        //operation.sortJDK(people1,cp);
        //operation.sortJDK(people2,cp);
        //operation.sortJDK(people2,cp);
        //operation.sort(people1,cp);
        System.out.println(operation. lastOperatio());
        System.out.println(operation.iterationTime1(people2));
        System.out.println(operation.iterationTime2(people2));
//        operation.sort(people2,cp);
//        System.out.println(people2.size());
//        System.out.println(operation. lastOperatio());
        System.out.println(operation.allOperation());
//        System.out.println("------------HashSet1-------------");
//        for (Animal person:sortedList) {
//            System.out.println(person.toString());
//        }
//        animals3 = new HashSet<>(sortedList);
//        System.out.println("------------TreeSet-------------");
//        for (Animal person:animals4) {
//            System.out.println(person.toString());
//        }
//        System.out.println("------------HashSet-------------");
//        for (Animal person:animals3) {
//            System.out.println(person.toString());
//        }
//        System.out.println("------------LinkedList-------------");
//        for (Person person:people2) {
//            System.out.println(person.toString());
//        }
//        System.out.println("------------ArrayList-------------");
//        for (Person person:people1) {
//            System.out.println(person.toString());
//        }
    }



}
