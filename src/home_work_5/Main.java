package home_work_5;

import home_work_5.api.IGenerator;
import home_work_5.comparators.AnimalComporator;
import home_work_5.comparators.PersonComparator;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.generators.*;

import java.util.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //Создаю необходимые генераторы
        IGenerator generator1 = new NameGeneratorFromFile();
        IGenerator generator2 = new NickGeneratorFromFile();
        IGenerator generator3 = new NumberGenerator(5,10);

        //Создаю обьект который умеет все необходимые мне операции
        Operation operation = new Operation();

        //Создаю компараторы
        Comparator<Person> cp = new PersonComparator();
        Comparator<Animal> ca = new AnimalComporator();

        //Создаю пустые коллекции с которыми буду работать
        List<Person> people1 = new ArrayList<>();
        List<Person> people2 = new ArrayList<>();
        Set<Person> people3 = new HashSet<>();
        Set<Person> people4 = new TreeSet<>(cp);
        List<Animal> animals1 = new ArrayList<>();
        List<Animal> animals2 = new ArrayList<>();
        Set<Animal> animals3 = new HashSet<>();
        Set<Animal> animals4 = new TreeSet<>(ca);

        //6.2 Заполняем 100_000 элементами Person  и Animal коллекции
        operation.genPerson(generator2,generator3,generator1,people1,100_000);
        operation.genPerson(generator2,generator3,generator1,people2,100_000);
        operation.genPerson(generator2,generator3,generator1,people3,100_000);
        operation.genPerson(generator2,generator3,generator1,people4,100_000);
        operation.genAnimal(generator2,15,animals1,100_000);
        operation.genAnimal(generator2,15,animals2,100_000);
        operation.genAnimal(generator2,15,animals3,100_000);
        operation.genAnimal(generator2,15,animals4,100_000);

        //6.3 Сортировка коллекции
        operation.sortJDK(people1,cp);
        operation.sortJDK(people2,cp);
        operation.sortJDK(animals1,ca);
        operation.sortJDK(animals2,ca);
        operation.sort(people1,cp);
        operation.sort(people2,cp);
        operation.sort(animals1,ca);
        operation.sort(animals2,ca);

        //Замерить время и распечатать к консоль скорость выполнения каждой операйции:

        //Итерирования коллекции:
        operation.iterationTime1(people2);
        operation.iterationTime1(people2);
        operation.iterationTime1(people3);
        operation.iterationTime1(people4);
        operation.iterationTime2(people1);
        operation.iterationTime2(people2);
        operation.iterationTime2(people3);
        operation.iterationTime2(people4);

        //Удаления всех элементов коллекции (выбрать один из):
//        operation.deleteCollection1(animals1);
//        operation.deleteCollection1(animals2);
//        operation.deleteCollection1(animals3);
//        operation.deleteCollection1(animals4);
        operation.deleteCollection2(animals1);
        operation.deleteCollection2(animals2);
        operation.deleteCollection2(animals3);
        operation.deleteCollection2(animals4);

        System.out.println(operation.allOperation());

    }



}
