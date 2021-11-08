package archetype.collect;

public class DemoCollections {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);
        list.set(2, "Hi");
        System.out.println(list);
    }
}
//        String[] arr = {"one", "two"};
//        for (String s : arr) {
//            System.out.println(s);
//        }
//        String word = "three";
//        String[] arr2 = new String[3];
//        System.arraycopy(arr, 0, arr2, 0, arr.length);
//        arr2[2] = word;
//        // for (String s : arr2) {
//        // System.out.println(s);
//        // }
//        System.out.println(arr2[2]);
//
//        for (int i = 0; i < arr2.length - 1; i++) {
//            arr2[i] = arr2[i + 1];
//        }
//
//        String[] arr3 = new String[2];
//        System.arraycopy(arr2, 0, arr3, 0, arr3.length);
//        for (String s : arr3) {
//            System.out.println(s);
//        }
//
//        System.out.println(arr3.length);