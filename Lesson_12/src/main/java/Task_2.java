import java.util.*;
public class Task_2 {
        public static void main(String[] args) {
            System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
            System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
            System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
        }

        public static Map<String, Boolean> wordMultiple(String[] strings) {
            Map<String, Integer> countMap = new HashMap<>();
            Map<String, Boolean> result = new HashMap<>();

            for (String str : strings) {
                countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            }

            for (String str : strings) {
                result.put(str, countMap.get(str) >= 2);
            }

            return result;
        }
    }

