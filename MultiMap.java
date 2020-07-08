package phone;

import java.util.*;

public class MultiMap {

    private HashMap<Object, Object>[] maps;

    MultiMap(int indices) {
        
        maps = new HashMap[indices];

    }

    public void add(int index, Object key, Object value) {

        for(int i = 0; i < maps.length; i ++) {
            if(i == index) {
                maps[i].put(key, value);
            } else {
                maps[i].put(null, value);
            }
        }

    }

    public Object get(Object key) {
        
        for(int i = 0; i < maps.length; i ++) {
            if(maps[i].containsKey(key)) {
                return maps[i].get(key);
            }
        }
        return null;

    }

}