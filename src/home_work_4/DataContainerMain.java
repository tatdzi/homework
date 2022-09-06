package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container1 = new DataContainer<>(new String[5]);
        DataContainer<Integer> container2 = new DataContainer<>(new Integer[5]);
        DataContainer<Integer> container3 = new DataContainer<>(new Integer[]{null,4,1,null,34,7,null});
        System.out.println(Arrays.toString(container3.getItems()));
        System.out.println(Arrays.toString(container3.getItems()));
        System.out.println(container3.toString());
        Comparator<String> comparatorS = new StringComparator();
        Comparator<Integer> comparatorI = new IntegerComparator();

        container2.add(3);
        container2.add(1);
        container2.add(4);
        container2.add(3454);
        container2.add(777);
        container2.add(2);
        container2.add(777);

         container1.add("i");
         container1.add("hello");
         container1.add("4");
         container1.add("1");
         container1.add("777");
         container1.add("Как домашка?");
         container1.add("777");

        System.out.println(container1.toString());
        System.out.println(container1.delete(3));
        System.out.println(container1.delete("777"));
        container1.sort(container1,comparatorS);
        System.out.println(container1.toString());
        System.out.println("_________________________________________________");
        System.out.println(container2.toString());
        System.out.println("Удаление item : "+container2.delete((Integer) 777));
        container2.sort(container2,comparatorI);
        System.out.println(container2.toString());
        System.out.println(Arrays.toString(container2.getItems()));


        for (Integer element : container2){
            System.out.println(element);
        }
    }
}
