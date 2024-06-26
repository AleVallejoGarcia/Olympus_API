package com.olympus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympus.models.Admin;

@Repository // Indicates that this interface is a repository component
public interface AdminRepository extends JpaRepository<Admin, Long> {
	// Query method to find an admin by email Parameters: adminMail (String): The
	// administrator's email address.Return: The administrator corresponding to the
	// given email.
	Admin findByAdminMail(String adminMail);
}
