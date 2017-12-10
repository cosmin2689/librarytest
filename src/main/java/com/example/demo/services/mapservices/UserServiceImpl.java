package com.example.demo.services.mapservices;

import com.example.demo.domain.DomainObject;
import com.example.demo.domain.User;
import com.example.demo.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cosmin on 12/9/2017.
 */
@Service
public class UserServiceImpl extends AbstractMapService implements UserService {
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public User getById(Integer id) {
        return (User) super.getById(id);
    }

    @Override
    public User saveOrUpdate(User domainObject) {
        return (User) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

}
