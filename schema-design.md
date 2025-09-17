# Database Schema Design

## Tables

### tblUsers
- userId (INT, PK, AUTO_INCREMENT)
- username (VARCHAR)
- password (VARCHAR)
- role (ENUM: 'Admin', 'Doctor', 'Patient')

### tblDoctors
- doctorId (INT, PK, AUTO_INCREMENT)
- name (VARCHAR)
- specialization (VARCHAR)
- availableTimes (TEXT or JSON)

### tblPatients
- patientId (INT, PK, AUTO_INCREMENT)
- name (VARCHAR)
- dob (DATE)
- gender (VARCHAR)

### tblAppointments
- appointmentId (INT, PK, AUTO_INCREMENT)
- doctorId (FK -> tblDoctors.doctorId)
- patientId (FK -> tblPatients.patientId)
- appointmentTime (DATETIME)
