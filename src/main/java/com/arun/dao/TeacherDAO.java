package com.arun.dao;


import com.arun.model.Teacher;

import java.util.List;

public interface TeacherDAO {
    public void addTeacher(Teacher teacher);
    public List<Teacher> getAllTeachers();
    public Teacher getTeacher(long teacherID);
    public Teacher updateTeacher(Teacher teacher);
}
