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

    }
}
