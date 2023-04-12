package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getStudentById(){
        return studentRepository.findAllById(1);
    }

    public List<Student> getStudentByAge(){
        return studentRepository.findAllByAge(201);
    }
}
