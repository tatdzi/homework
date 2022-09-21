package home_work_5.comparators;

import home_work_5.api.dto.Animal;

import java.util.Comparator;

public class AgeAnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.getAge()-o1.getAge();
    }
}
