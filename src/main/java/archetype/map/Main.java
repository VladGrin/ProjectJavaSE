package archetype.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = getWords("aaa sss aaa sss ddd");
        System.out.println(words);
        Map<String, Integer> duplicates = getDuplicates(words);
        System.out.println(duplicates);
    }

    public static List<String> getWords(String str) {
        String[] s = str.split(" ");
        return Arrays.asList(s);
    }

    public static Map<String, Integer> getDuplicates(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer count = map.get(word);
            if (Objects.isNull(count)) {
                map.put(word, 1);
            } else {
                map.put(word, ++count);
            }
        }
        return map;
    }
}
