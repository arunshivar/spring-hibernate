package com.arun.dao;

import com.arun.model.Teacher;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDAOImpl implements TeacherDAO {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void addTeacher(Teacher teacher) {
        sessionFactory.getCurrentSession().save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        /*Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Teacher.class);
        return criteria.list();*/

        return sessionFactory.getCurrentSession().createQuery("from Teacher").list();
    }

    @Override
    public Teacher getTeacher(long teacherID) {
        return (Teacher) sessionFactory.getCurrentSession().get(Teacher.class, teacherID);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        sessionFactory.getCurrentSession().update(teacher);
        return teacher;
    }
}
