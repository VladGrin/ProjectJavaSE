package archetype.collect;

public class MyArrayList implements MyList{
    private static final int INIT_CAPACITY = 3;
    private static final int LOAD_FACTOR = 2;

    private String[] array = new String[INIT_CAPACITY];
    private int size = 0;
    private int capacity = INIT_CAPACITY;

    @Override
    public boolean add(String element) {
        increaseCapacity();
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(int index) {
        checkValidIndex(index);
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        size--;
        return true;
    }

    @Override
    public boolean remove(String element) {
        if (element == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)){
                for (int j = i; j < size-1; j++) {
                    array[j]=array[j+1];
                }
                array[size-1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, String element) {
        checkValidIndex(index);
        increaseCapacity();
        for (int i = size; i >= index ; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
        return false;
    }

    @Override
    public String get(int index) {
        checkValidIndex(index);
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(array[i]).append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

    private void increaseCapacity() {
        if(capacity == size) {
            capacity = capacity * LOAD_FACTOR;
            String[] temp = new String[capacity];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
    }

    private void checkValidIndex(int index) {
        if (index >= size || index < 0) {
            throw new MyIndexOutOfBoundException("out aff array");
        }
    }
}
