package com.olympus.repositories;

import org.springframework.stereotype.Repository;

import com.olympus.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository // Indicates that this interface is a repository component
public interface UserRepository extends JpaRepository<User, Long> {
    // Query method to find a user by email Parameters: userMail (String): The
    // user's email address.Return: The user corresponding to the given email.
    User findByUserMail(String userMail);

    // Query method to find a user by ID Parameters: id (long): The user ID. Return:
    // The user corresponding to the given ID.
    User findById(long id);
}
