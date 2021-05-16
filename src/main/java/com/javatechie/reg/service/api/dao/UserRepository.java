package com.javatechie.reg.service.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.reg.service.api.model.Users;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Integer> {
    List<Users> findByEmail(String email);
}
