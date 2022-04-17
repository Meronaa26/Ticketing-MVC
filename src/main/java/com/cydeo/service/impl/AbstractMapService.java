package com.cydeo.service.impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract  class AbstractMapService<T , ID>{

    protected Map<ID,T>map=new HashMap<>(); // i am using key and value in order to access the values to update, save and retrieve.........
                                            // because map have key and values and that's how I should find objects and update it
                                           //  for example ==> looking by id and updating by value

    T save(ID id, T object){
        map.put(id,object);
        return object;
    }

    List<T> findAll(){
        return new ArrayList<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    void deleteById(ID id){
        map.remove(id);
    }

    void update(ID id ,T object){
        map.put(id,object);
    }

}
