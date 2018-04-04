package com.arun.dao;

import com.arun.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void deleteStudent(Integer studentId) {

    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public String getStudent(int studentId) {
        return null;
    }
}
