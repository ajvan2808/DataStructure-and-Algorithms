package src.main.java;
/**
 * dynamicArrays
 */
public class dynamicArrays<String> {
    private Object[] data;
    private int size;
    private int initialCapacity;

    public dynamicArrays(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public String get(int index) {
        return (String)data[index];
    }

    public void set(int index, String value) {
        if (index < initialCapacity) {
            data[index] = value;
        } else {
            // Error handling
            throw new IndexOutOfBoundsException("Index is too big");
        }
    }

    // Insert to array
    public void insert(int index, String value) {
        // check size
        if (size == initialCapacity) {
            resize();
        }
        // copying
        for(int j = size; j > index; j--) {
            data[j] = data[j-1];
        }
        // insert
        data[index] = value;
        size++;
    }

    // Delete array element
    public void delete(int index) {
        for(int j = index; j < size-1; j++) {
            data[j] = data[j+1];
        }
        size--;
    }

    // Check if array is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // Check if array contains the value
    public boolean Contains(String value) {
        for (int i = 0; i <= size -1; i++) {
            String currentValue = (String) data[i];
            if (currentValue.equals(value)) {
                return true;
            }
        }
        return false;
    }

    // Resize the array
    private void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for(int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }

    // Get size of array
    public int size() {
        return size;
    }

    // Print array
    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.println("data[i] = " + data[i]);
        }
    }

    // Some array implementations offer method like add (also known as pushBack). Literally, insert at the end of the array
    public void add(String value) {
        if (size == initialCapacity) {
            resize();
        }
        data[size] = value;
        size++;
    }
}
