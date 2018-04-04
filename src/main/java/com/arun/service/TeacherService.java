package com.arun.service;

import com.arun.model.Teacher;

import java.util.List;

public interface TeacherService {

    public void addTeacher(Teacher teacher);

    public List<Teacher> getAllTeachers();

    public Teacher getTeacher(long teacherID);
    public Teacher updateTeacher(Teacher teacher);
}
