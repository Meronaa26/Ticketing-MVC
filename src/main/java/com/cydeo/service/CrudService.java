package com.cydeo.service;

import java.util.List;

public interface CrudService<T, ID> {  //I need to pass some object and ID(unique identifier)
    T save(T object);
    List<T> findAll();
    T findById(ID id);
   void  deleteById(ID id);
   void update(T object);

}
