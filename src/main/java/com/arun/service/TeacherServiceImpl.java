package com.arun.service;

import com.arun.dao.TeacherDAO;
import com.arun.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDAO teacherDAO;

    public void addTeacher(Teacher teacher) {
        teacherDAO.addTeacher(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherDAO.getAllTeachers();
    }

    @Override
    public Teacher getTeacher(long teacherID) {
        return teacherDAO.getTeacher(teacherID);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherDAO.updateTeacher(teacher);
    }
}
