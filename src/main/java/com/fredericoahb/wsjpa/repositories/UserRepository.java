package com.fredericoahb.wsjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.wsjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
