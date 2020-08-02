package structures.hastable;

/**
 * Created by Gurupad Mamadapur on 02/08/20
 */
public class DirectAddressedTable<T> {

    interface Value<T> {

        int key();

        T get();
    }

    private final Object[] table;

    public DirectAddressedTable(int capacity) {
        this.table = new Object[capacity];
    }

    public void insert(Value<T> x) {
        table[x.key()] = x.get();
    }

    public void delete(Value<T> x) {
        table[x.key()] = null;
    }

    public boolean contains(Value<T> x) {
        return table[x.key()] != null;
    }

    public T get(Value<T> x) {
        return (T) table[x.key()];
    }
}
