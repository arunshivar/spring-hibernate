package com.arun.dao;

import com.arun.model.Course;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCourse(Course course) {
        sessionFactory.getCurrentSession().save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return sessionFactory.getCurrentSession().createQuery("from Course").list();
    }
}
