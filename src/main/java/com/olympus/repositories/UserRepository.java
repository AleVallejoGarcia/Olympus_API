package com.olympus.repositories;

import org.springframework.stereotype.Repository;

import com.olympus.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String Name);
}
