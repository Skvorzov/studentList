package com.example.studentlist.repository;

import com.example.studentlist.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<Student, Long> {
}