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
        System.out.println(Task4.convertToString(Task4.adding(map1, map2)));
    }
}
class Task4 {
    public static String convertToString(Map<Integer, Integer> map){
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        return String.join(" + ", list);
    }
    public static Map<Integer, Integer> adding(Map<Integer, Integer> map1, Map<Integer, Integer> map2){
        Map<Integer, Integer> resultMap = new HashMap<>(map1);
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            resultMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return resultMap;
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
