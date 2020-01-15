package com.nam.crudprac.service;

import com.nam.crudprac.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void deleteById(int id);
    User save(User user);
    void updateById(int id, User user);
}
