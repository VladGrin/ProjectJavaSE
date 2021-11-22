package archetype.map;

import archetype.set.DayOfWeek;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        // Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("Mers", 5);
        map.put("BMW", 8);
        map.put("VOLVO", 4);
        System.out.println(map);//1
        final Integer volvo = map.put("VOLVO", 9);
        System.out.println(volvo);//2
        System.out.println(map);//3
        System.out.println(map.get("Mers"));//4
        System.out.println(map.get("Chevrolet"));//5
        System.out.println(map.size());//6

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println(keys);
        System.out.println(values);
        // map.clear();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<DayOfWeek, Character> days = new EnumMap<>(DayOfWeek.class);
        days.put(DayOfWeek.FRIDAY, 'F');
        days.put(DayOfWeek.MONDAY, 'M');
        days.put(DayOfWeek.SUNDAY, 'S');
        final Character ch = days.get(DayOfWeek.MONDAY);
        System.out.println(ch);

        PropertyLoader loader = new PropertyLoader();
        Properties props = loader.loadFile("application.properties");
        String name = props.getProperty("name");
        System.out.println(name);
        String url = props.getProperty("spring.datasource.url");
        System.out.println(url);
        props.list(System.out);
    }
}
