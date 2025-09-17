package com.example.clinic.service;

import com.example.clinic.model.Appointment;
import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    public Appointment bookAppointment(Appointment appointment) {
        appointments.add(appointment);
        return appointment;
    }

    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDate date) {
        // Giả lập dữ liệu, sau này kết nối DB
        return appointments.stream()
                .filter(a -> a.getDoctor().getId().equals(doctorId)
                        && a.getAppointmentTime().toLocalDate().equals(date))
                .toList();
    }
}
