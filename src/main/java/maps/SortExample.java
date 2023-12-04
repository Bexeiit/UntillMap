package maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        Person bex = new Person(1, "Bexeit", "Atabek");
        Person aim = new Person(2, "Aiym", "Shaden");
        Person smn = new Person(3, "Asd", "Qwerty");
        Person dam = new Person(4, "Dam", "Mad");

        List<String> strings = Arrays.asList("12","2312","4", "1");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> people = Arrays.asList(aim,bex, smn, dam);

        Collections.sort(people);
        System.out.println(people);

//        people.sort(new FirstNameComparator());
        people.sort(Comparator.comparing(Person::getId));
        System.out.println(people);
    }

    public static class FirstNameComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
