package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findAllById(int i);

    List<Student> findAllByName(String name);

    @Query(
            value = "SELECT * FROM student s WHERE s.age = ?1",
            nativeQuery = true)
    List<Student> findAllByAge(int i);
}
