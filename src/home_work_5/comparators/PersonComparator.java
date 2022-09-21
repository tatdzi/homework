package home_work_5.comparators;

import home_work_5.api.dto.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if ((o1.getPassword().length()-o2.getPassword().length()) == 0){
            return o1.getNick().compareTo(o2.getNick());
        }else {
            return o1.getPassword().length()-o2.getPassword().length();
        }
    }
}
