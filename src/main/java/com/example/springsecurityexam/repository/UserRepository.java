package com.example.springsecurityexam.repository;

import com.example.springsecurityexam.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
