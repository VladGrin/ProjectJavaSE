package archetype.innerclasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;
    private String name;
    private int group;
    private String faculty;
    private Address address;

    @Data
    @NoArgsConstructor
    class Address {
        private String city;
        private String street;
        private int houseId;
        private int flatId;
        private String email;
        private String instagram;
    }
}
