package archetype.innerclasses;

import java.util.Arrays;
import java.util.List;

public class DemoNestedClasses {
    public static void main(String[] args) {
        NestedOwner.OwnerComparator comparator = new NestedOwner.OwnerComparator();

        NestedOwner owner1 = new NestedOwner(5);
        NestedOwner owner2 = new NestedOwner(0);
        NestedOwner owner3 = new NestedOwner(10);

        List<NestedOwner> owners = Arrays.asList(owner1, owner2, owner3);
        owners.sort(comparator);
        System.out.println(owners);

        Phone phone = new Phone.PhoneBuilder()
                .setId(1)
                .setModel("Galaxy A-35")
                .setCompany("Samsung")
                .setCost(5.999)
                .setRem(8)
                .setDisplay(9.0)
                .setCountry("China")
                .build();

        System.out.println(phone);

    }
}
