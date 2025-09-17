package com.example.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping("/{id}/availability")
    public ResponseEntity<String> getDoctorAvailability(@PathVariable Long id) {
        // Giả sử validate token thành công
        return ResponseEntity.ok("Available times for doctor " + id);
    }
}
