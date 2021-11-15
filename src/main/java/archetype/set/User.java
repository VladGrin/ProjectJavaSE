package archetype.set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class User /*implements Comparable<User> */{
    private String name;
    private int age;

//    @Override
//    public int compareTo(User o) {
//        return name.compareTo(o.name);
//    }

//    @Override
//    public int compareTo(User o) {
//        return age - o.age;
//    }
}
