package com.example.authorization_service.repository;


import com.example.authorization_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String name);

}
