package com.olympus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @DeleteMapping("/admins/{adminId}")
    public void deleteAdmin(@PathVariable Long adminId) {
        try {
            adminRepository.deleteById(adminId);
        } catch (Exception e) {
            System.out.println("Admin Id " + adminId + " not found");
        }
    }

    @GetMapping("/admins/{adminName}")
    public Admin getAdminByName(@PathVariable String adminName) {
    	return adminRepository.findByadminName(adminName);
    }
    
    
    @PutMapping("/admins/{adminId}")
    public Admin updateAdminById(@PathVariable Long adminId, @RequestBody Admin adminRequest) {
        return adminRepository.findById(adminId).map(admin -> {
            admin.setadminName(adminRequest.getadminName());
            admin.setadminMail(adminRequest.getadminMail());
            admin.setadminPassword(adminRequest.getadminPassword());

            return adminRepository.save(admin);
        }).orElseThrow(
                () -> new ResourceNotFoundException("User not found with id " + adminId));
    }

    @PostMapping("/admin")
    public Admin createAdmin(@RequestBody Admin userRequest) {
        return adminRepository.save(userRequest);
    }
}
