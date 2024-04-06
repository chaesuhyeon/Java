import java.util.HashMap;
import java.util.Map;

public class GenericMap<K, V> {
    private Map<K, V> map;

    public GenericMap() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public static void main(String[] args) {
        GenericMap<String, Integer> map = new GenericMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Value for key 'Three': " + map.get("Three"));
    }
}
