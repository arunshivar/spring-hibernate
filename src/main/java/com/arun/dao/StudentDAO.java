package com.arun.dao;

import com.arun.model.Student;

import java.util.List;

public interface StudentDAO {

    public void addStudent(Student student);

    public List<Student> getAllStudents();

    public void deleteStudent(Integer studentId);

    public Student updateStudent(Student student);

    public String  getStudent(int studentId);
}
