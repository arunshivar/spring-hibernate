package com.arun.service;

import com.arun.dao.StudentDAO;
import com.arun.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    @Transactional
    public void addStudent(Student student) {
        System.out.println("In service");
        studentDAO.addStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void deleteStudent(Integer studentId) {

    }

    @Override
    public Student getStudent(int studentId) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }
}
