package archetype.collect;

public interface MyList {
// Create  Read Update Delete
    boolean add(String element);
    boolean remove(int index);
    boolean remove(String element);
    boolean set(int index, String element);
    String get(int index);
    String toString();
    int size();
    boolean isEmpty();
}
