package com.example.repository;

import com.example.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Derived query by email
    Optional<Patient> findByEmail(String email);

    // Derived query by email OR phone number
    Optional<Patient> findByEmailOrPhoneNumber(String email, String phoneNumber);
}
