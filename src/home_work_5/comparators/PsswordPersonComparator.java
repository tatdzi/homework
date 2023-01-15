package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class PsswordPersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getPassword().length()-o1.getPassword().length();
    }
}
