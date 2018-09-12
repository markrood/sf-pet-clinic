package rood.mark.sfpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID> {
    Map map = new HashMap();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return (T) map.get(id);
    }
    T save(ID id, T object){
        return (T) map.put(id,object);
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry->entry.equals(object));
    }
}
