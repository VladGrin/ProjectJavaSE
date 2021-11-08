package archetype.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(58);
        newArrayList.add(null);
        newArrayList.add(20);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.addAll(newArrayList);
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.contains(10));
        arrayList.remove(5);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(5));
        System.out.println(arrayList);
        Integer[] nums = (Integer[]) arrayList.toArray();

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        for (Integer num : arrayList) {
            System.out.println(num);
        }
//        arrayList.forEach(System.out::println);

        arrayList.clear();
        System.out.println(arrayList.isEmpty());

        List<Double> doubleList = new LinkedList<>();
    }
}
