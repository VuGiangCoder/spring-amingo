package com.example.demo.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

   private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/")
    public List<Student> getStudents(){
        return studentService.getStudent();
    }

    @RequestMapping("/save")
    public void saveStudent(){
        studentService.saveStudent(new Student("giang dep trai",20));
    }

    @RequestMapping("/id")
    public List<Student> getStudentById(){
        return studentService.getStudentById();
    }

    @RequestMapping("/age")
    public List<Student> getStudentByAge(){
        return studentService.getStudentByAge();
    }

}
