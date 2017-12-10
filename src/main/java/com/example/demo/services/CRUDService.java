package com.example.demo.services;

import java.util.List;

/**
 * Created by Cosmin on 12/9/2017.
 */
public interface CRUDService<T> {
    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate( T domainObject);

    void delete(Integer id);
}
