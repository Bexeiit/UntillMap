package maps;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person bex = new Person(1, "Bexeit", "Atabek");
        Person aim = new Person(2, "Aiym", "Shaden");
        Person smn = new Person(3, "Asd", "Qwerty");
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(bex.getId(), bex);
        personMap.put(aim.getId(), aim);

        System.out.println(personMap);
        System.out.println(personMap);
    }
}
