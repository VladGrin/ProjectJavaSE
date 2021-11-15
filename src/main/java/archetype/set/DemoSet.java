package archetype.set;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("one");
//        set.add("two");
//        set.add("three");
//        set.add("four");
//        System.out.println(set);
//        System.out.println(set.contains("one"));
//
//        Set<String> lset = new LinkedHashSet<>();
//        lset.add("one");
//        lset.add("two");
//        lset.add("three");
//        lset.add("four");
//        System.out.println(lset);
//
//        Set<String> tset = new TreeSet<>();
//        tset.add("one");
//        tset.add("two");
//        tset.add("three");
//        tset.add("four");
//        tset.add("four");
//        System.out.println(tset);

        User user1 = new User("Max", 35);
        User user2 = new User("Bob", 40);
        User user3 = new User("Max", 35);
        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

//        System.out.println(users);

//        Set<User> sortedUsers = new TreeSet<>(new UserComparator());
        Comparator<User> userComparator = Comparator.comparing(User::getName);
        Set<User> sortedUsers = new TreeSet<>(userComparator);
        sortedUsers.add(user1);
        sortedUsers.add(user2);
        sortedUsers.add(user3);
        System.out.println(sortedUsers);


//        System.out.println(user2.hashCode());
//        System.out.println(user1.hashCode());
//        System.out.println(user1.equals(user2));

        EnumSet<DayOfWeek> day = EnumSet.allOf(DayOfWeek.class);
        day = EnumSet.range(DayOfWeek.TUESDAY, DayOfWeek.FRIDAY);
        day = EnumSet.complementOf(day);
        System.out.println(day);
    }
}
