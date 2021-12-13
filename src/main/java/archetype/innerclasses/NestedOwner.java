package archetype.innerclasses;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class NestedOwner {
    private int value;

    public static class OwnerComparator implements Comparator<NestedOwner> {

        @Override
        public int compare(NestedOwner o1, NestedOwner o2) {
            return o1.value - o2.value;
        }
    }
}
