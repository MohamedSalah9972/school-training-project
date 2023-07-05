package com.careem.school.service;

import com.careem.school.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student createStudent(Student student);

    Student updateStudent(Student student);

    boolean deleteStudent(Long id);

}