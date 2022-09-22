package home_work_5;

import home_work_5.api.IGenerator;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Operation {
    private List<ChackTimeOperation> chackTimes = new ArrayList<>();

    public Operation() {

    }

    public void addPerson(IGenerator nick,IGenerator password, IGenerator name, List<Person> people, int count){
        String name1 = "Заполнение коллекции из "+count+ " Person";
        long start = System.currentTimeMillis();
        for (int i = 0; i<count; i++){
            people.add(new Person(
                    nick.generate(),
                    password.generate(),
                    name.generate()
            ));
        }
        long time = System.currentTimeMillis() - start;
        this.chackTimes.add(new ChackTimeOperation(name1,time));
    }


    public void addAnimal (IGenerator nick, Set<Animal> animal, int count){
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        String name = "Заполнение коллекции из "+count+ " Animal";
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            animal.add(new Animal(
                    rnd.nextInt(5,11),
                    nick.generate()
            ));
        }
        long time = System.currentTimeMillis() - start;
        this.chackTimes.add(new ChackTimeOperation(name,time));
    }
    public void sortJDK(List list,Comparator comparator){
        String name = "Сортировка коллекции средствами jdk";
        long start = System.currentTimeMillis();
        Collections.sort(list,comparator);
        long time = System.currentTimeMillis() - start;
        this.chackTimes.add(new ChackTimeOperation(name,time));
    }

    public <T> void sort(List<T> list, Comparator<T> comp) {
        String name = "Сортировка коллекции моим методом";
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (comp.compare(list.get(i), list.get(j)) > 0) {
                    T a = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,a);
                }
            }
        }
        long time = System.currentTimeMillis() - start;
        this.chackTimes.add(new ChackTimeOperation(name,time));
    }
    public <T> String iterationTime1(List<T> list){
        String name = "Сортировка коллекции моим методом";
        long start = System.currentTimeMillis();
        for (T element: list){
        }
        long time = System.currentTimeMillis() - start;
        return "Время итерации: "+time+" мс";
    }

    public <T> String iterationTime2(List<T> list){
        String name = "Итерирование с помощью iterator ";
        long start = System.currentTimeMillis();
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        long time = System.currentTimeMillis() - start;
        this.chackTimes.add(new ChackTimeOperation(name,time));
        return "Время итерации: "+time+" мс";
    }



    public String allOperation(){
        StringBuilder builder = new StringBuilder();
        builder.append("Таблица времени затрачееного на выполнение операций ")
                .append("\n");
        int i = 1;
        for (ChackTimeOperation operation:chackTimes){
            builder.append(i)
                    .append(".")
                    .append(operation.toString())
                    .append("\n");
            i++;
        }
        return builder.toString();
    }
    public String lastOperatio(){
        StringBuilder builder = new StringBuilder();
        ChackTimeOperation last = chackTimes.get(chackTimes.size()-1);
        builder.append("Последняя выполненная операция :")
                .append(last.toString())
                .append("\n");
        return builder.toString();
        }

}
