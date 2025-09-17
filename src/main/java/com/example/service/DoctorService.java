package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    // Return available time slots for a doctor on given date
    public List<String> getAvailableSlots(Long doctorId, String date) {
        return Arrays.asList("09:00 AM", "11:00 AM", "02:00 PM"); 
    }

    // Validate doctor login
    public ResponseEntity<?> validateDoctorLogin(String username, String password) {
        if ("doctor1".equals(username) && "password123".equals(password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.badRequest().body("Invalid credentials");
        }
    }
}
