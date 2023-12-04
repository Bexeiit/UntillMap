package kz.bxit.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(integers);
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();){
            Integer next = iterator.next();
            if (next == 4 || next == 5){
                iterator.remove();
            }
        }
        System.out.println(list);

        list.forEach(System.out::println);
    }
}