package home_work_5;

import home_work_5.api.IGenerator;
import home_work_5.comparators.AnimalComporator;
import home_work_5.comparators.PersonComparator;
import home_work_5.api.dto.Animal;
import home_work_5.api.dto.Person;
import home_work_5.generators.NameGenerator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        IGenerator generator = new NameGenerator();
        Comparator<Person> cp = new PersonComparator();
        Comparator<Animal> ca = new AnimalComporator();
        List<Person> people1 = new ArrayList<>();
        List<Person> people2 = new LinkedList<>();
        Set<Animal> animals3 = new HashSet<>();
        Set<Animal> animals4 = new TreeSet<>(ca);
        operation.addPerson(generator,people1,1_000_000);
        System.out.println(operation.getCheckTime());
        operation.addPerson(generator,people2,1_000_000);
        System.out.println(operation.getCheckTime());
        operation.addAnimal(generator,animals3,1_000_000);
        System.out.println(operation.getCheckTime());
        operation.addAnimal(generator,animals4,1_000_000);
        System.out.println(operation.getCheckTime());
        Collections.sort(people1,cp);
        Collections.sort(people1,cp);
        Collections.sort(people2,cp);
        Collections.sort(people2,cp);
        List<Animal> sortedList = new ArrayList<>(animals3);
        Collections.sort(sortedList,ca);
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
