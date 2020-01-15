package com.nam.crudprac.repository;

import com.nam.crudprac.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();
    User findById(int id);
    void deleteById(int id);
    User save(User user);
}
