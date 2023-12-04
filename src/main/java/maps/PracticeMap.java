package maps;


import java.util.*;

public class PracticeMap {
    public static void main(String[] args) {

        Map<Integer,Integer> map1 = Map.of(
                0,5,
                1,3,
                3,2,
                5,4,
                6,7
        );

        Map<Integer,Integer> map2 = Map.of(
                0,5,
                3,4,
                5,5,
                6,1
        );
//        Map<String, String> map = new HashMap<>();
//        map.put("asd", "qwe");
//        map.put("dsa", "ewq");
//        map.put("sad", "sda");
//        map.put("qsx", "qwe");
//        System.out.println(Task3.isUnique(map));
    }
}
class Task4 {
    public static String adding(Map<Integer, Integer> map1, Map<Integer, Integer> map2){
        // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10x^0
//        Map<Integer,Integer> map1 = Map.of(
//                0,5,
//                1,3,
//                3,2,
//                5,4,
//                6,7
//        );
//
//        Map<Integer,Integer> map2 = Map.of(
//                0,5,
//                3,4,
//                5,5,
//                6,1
//        );
        StringBuilder str = new StringBuilder();
        String xAndPower = "x^";
        for (int i = map1.size() - 1; i >= 0; i++) {
            if (map1.containsKey(map2)){
                str.append(12);
            }
        }
        return null;
    }
}

class Task3 {
    public static boolean isUnique(Map<String, String> map){
//        Set<String> values = new HashSet<>(map.values());
//        return values.size() == map.values().size();

        return new HashSet<>(map.values()).size() == map.values().size();
    }
}
class Task2 {
    public static int countUnique(List<Integer> list){
//        Set<Integer> integers = new HashSet<>(list);
//        return integers.size();

        return new HashSet<>(list).size();
    }
}
class Task1 {
    public static List<Integer> evenNums(List<Integer> list){
        List<Integer> newList = new LinkedList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                newList.add(integer);
            }
        }
        return newList;
    }

}
