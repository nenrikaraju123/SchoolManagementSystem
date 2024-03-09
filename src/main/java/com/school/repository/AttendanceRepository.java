package com.school.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    public List<Attendance> findByRegNo(int regNo);
}
