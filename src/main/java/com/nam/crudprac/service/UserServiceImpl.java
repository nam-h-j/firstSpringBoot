package com.nam.crudprac.service;

import com.nam.crudprac.model.User;
import com.nam.crudprac.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(u -> users.add(u));
        return users;
    }

    @Override
    public User findById(int id) {
        User user = null;
        try{
            user = userRepository.findById(id);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void updateById(int id, User user) {
        User u;
        try{
            u = userRepository.findById(id);
            u.setName(user.getName());
            u.setEmail(user.getEmail());
            userRepository.save(user);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
