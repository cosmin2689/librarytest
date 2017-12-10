package com.example.demo.services.mapservices;

import com.example.demo.domain.Book;
import com.example.demo.domain.DomainObject;
import com.example.demo.services.BookService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cosmin on 12/9/2017.
 */
@Service
public class BookServiceImpl extends AbstractMapService implements BookService{
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Book getById(Integer id) {
        return (Book) super.getById(id);
    }

    @Override
    public Book saveOrUpdate(Book domainObject) {
        return (Book) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }
}
