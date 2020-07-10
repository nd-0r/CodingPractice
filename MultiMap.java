import java.util.*;

public class MultiMap<K, V> {

    private HashMap<K, V>[] maps;

    MultiMap(int indices) {
        
        maps = new HashMap[indices];

    }

    public void add(int index, K key, V value) {

        for(int i = 0; i < maps.length; i ++) {
            if(i == index) {
                maps[i].put(key, value);
            } else {
                maps[i].put(null, value);
            }
        }

    }

    public V get(K key) {
        
        for(int i = 0; i < maps.length; i ++) {
            if(maps[i].containsKey(key)) {
                return maps[i].get(key);
            }
        }
        return null;

    }

}