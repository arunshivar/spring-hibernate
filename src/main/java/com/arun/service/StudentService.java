package com.arun.service;

import com.arun.model.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student student);

    public List<Student> getAllStudents();

    public void deleteStudent(Integer studentId);

    public Student getStudent(int studentId);

    public Student updateStudent(Student student);
}
