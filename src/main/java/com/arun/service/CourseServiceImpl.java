package com.arun.service;


import com.arun.dao.CourseDAO;
import com.arun.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService  {

    @Autowired
    public CourseDAO courseDAO;


    @Override
    public void addCourse(Course course) {
        courseDAO.addCourse(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }
}
