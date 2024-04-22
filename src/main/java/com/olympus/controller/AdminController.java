package com.olympus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Admin;
import com.olympus.repositories.AdminRepository;

import com.olympus.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/olympus/v1")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    public void deleteAdmin(@PathVariable Long id) {
        try {
            adminRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Admin Id " + id + " not found");
        }
    }

    @PutMapping("/admin/{id}")
    public Admin updateAdminById(@PathVariable Long id, @RequestBody Admin adminRequest) {
        return adminRepository.findById(id).map(admin -> {
            admin.setName(adminRequest.getName());
            admin.setMail(adminRequest.getMail());
            admin.setPassword(adminRequest.getPassword());

            return adminRepository.save(admin);
        }).orElseThrow(
                () -> new ResourceNotFoundException("User not found with id " + id));
    }

    @PostMapping("/admin")
    public Admin createAdmin(@RequestBody Admin userRequest) {
        return adminRepository.save(userRequest);
    }
}
