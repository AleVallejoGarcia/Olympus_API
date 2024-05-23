package com.olympus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Admin;
import com.olympus.models.LoginAdminInformation;
import com.olympus.repositories.AdminRepository;

import com.olympus.exception.ResourceNotFoundException;

@RestController // Indicates that this class is a REST controller
@RequestMapping("/olympus/v1") // Base URL mapping for all request handlers in this class
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allowing cross-origin requests
public class AdminController {

    @Autowired // Injects an instance of AdminRepository
    AdminRepository adminRepository;

    // Handler method to delete an admin by ID Parameters: adminId (Long): The ID of
    // the admin to delete.
    @DeleteMapping("/admins/{adminId}")
    public void deleteAdmin(@PathVariable Long adminId) {
        try {
            adminRepository.deleteById(adminId);
        } catch (Exception e) {
            System.out.println("Admin Id " + adminId + " not found");
        }
    }

    // Handler method to verify admin credentials Parameters: adminRequest
    // (LoginAdminInformation): The login information of the admin to verify.
    // Return: boolean: true if the admin credentials are valid; otherwise, false.
    @PostMapping("/admins/verifyAdmin")
    public boolean verifyAdmin(@RequestBody LoginAdminInformation adminRequest) {
        Admin adminToVerify = adminRepository.findByAdminMail(adminRequest.getadminMail());
        if (adminToVerify != null && adminRequest.getadminPassword().equals(adminToVerify.getadminPassword())) {
            return true;
        } else {
            return false;
        }
    }

    // Handler method to update an admin by ID Parameters: adminId (Long): The ID of
    // the admin to update. adminRequest (Admin): The updated admin
    // information.Return: Admin: The updated admin entity.
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

    // Handler method to create a new admin Parameters userRequest (Admin): The
    // admin information for creation.Return Admin: The created admin entity.
    @PostMapping("/admin")
    public Admin createAdmin(@RequestBody Admin userRequest) {
        return adminRepository.save(userRequest);
    }
}
