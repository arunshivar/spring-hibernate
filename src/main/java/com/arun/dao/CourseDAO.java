package com.arun.dao;

import com.arun.model.Course;

import java.util.List;

public interface CourseDAO {
    public void addCourse(Course course);

    public List<Course> getAllCourses();
}
