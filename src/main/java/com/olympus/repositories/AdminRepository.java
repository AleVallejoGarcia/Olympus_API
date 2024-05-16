package com.olympus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympus.models.Admin;

@Repository

public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByAdminMail(String adminMail);

}
