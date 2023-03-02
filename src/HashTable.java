import java.util.NoSuchElementException;

public class HashTable<K,V> implements MapADT<K,V> {
    /**
     * Helper class that combines key and value pairs into a type for the array
     * @param <K>
     * @param <V>
     */
    private static class Entry<K,V> {
        public K key;
        public V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    protected Entry<K,V>[] hashtable;
    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        hashtable =(Entry<K,V>[]) new Entry[capacity];
        this.capacity = capacity;
    }
    @SuppressWarnings("unchecked")
    public HashTable() {
        hashtable = (Entry<K, V>[]) new Entry[8];
        this.capacity = 8;
    }


    @Override
    public void put(K key, V value) throws IllegalArgumentException {

    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public V get(K key) throws NoSuchElementException {
        return null;
    }

    @Override
    public V remove(K key) throws NoSuchElementException {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
