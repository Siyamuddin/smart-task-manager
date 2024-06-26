package com.taskmanager.taskmanager.Repository;

import com.taskmanager.taskmanager.Entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    List<User> findByFirstNameContaining(String userName);
    Optional<User> findByEmail(String email);
}
