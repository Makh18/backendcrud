package com.codingwithkouki.fullstackbackend.repository;

import com.codingwithkouki.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {
}
