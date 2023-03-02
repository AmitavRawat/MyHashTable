import java.util.NoSuchElementException;

/**
 * This abstract data type represents a collection that maps keys to values,
 * in which duplicate keys are not allowed (each key maps to exactly one value).
 */
public interface MapADT<K,V> {

    // add a new key-value pair/mapping to this collection
    // throws exception when key is null or duplicate of one already stored
    public void put(K key, V value) throws IllegalArgumentException;

    // check whether a key maps to a value within this collection
    public boolean containsKey(K key);

    // retrieve the specific value that a key maps to
    // throws exception when key is not stored in this collection
    public V get(K key) throws NoSuchElementException;

    // remove the mapping for a given key from this collection
    // throws exception when key is not stored in this collection
    public V remove(K key) throws NoSuchElementException;

    // remove all key-value pairs from this collection
    public void clear();

    // retrieve the number of keys stored within this collection
    public int getSize();

    // retrieve this collection's capacity (size of its underlying array)
    public int getCapacity();

}