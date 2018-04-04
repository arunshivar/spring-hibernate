package com.arun.service;

import com.arun.model.Course;

import java.util.List;

public interface CourseService {
    public void addCourse(Course course);
    public List<Course> getAllCourses();
}
