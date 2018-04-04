package com.arun.controller;

import com.arun.model.Course;
import com.arun.model.Teacher;
import com.arun.service.CourseService;
import com.arun.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TeacherController {


    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/addTeacher")
    public String displayTeacherPage(Model model) {
        Teacher teacher = new Teacher();
        teacher.getCourses().add(new Course());
        model.addAttribute("teacher", teacher);
        return "teacher";
    }

    @RequestMapping(value = "/saveTeacher", method = RequestMethod.POST)
    public ModelAndView saveTeacher(@ModelAttribute Teacher teacher) {
        if (teacher.getTeacherID() == 0) { // if employee id is 0 then creating the
            for(Course c : teacher.getCourses()) {
                c.setTeacher(teacher);
            }
            teacherService.addTeacher(teacher);
        } else {
            System.out.println("UPDATE"+teacher.getTeacherName());
            for(Course c : teacher.getCourses()) {
                System.out.println(c.getCourseName()+" "+c.getCourseId());
                c.setTeacher(teacher);
            }
            // teacher.setCourses(teacher.getCourses());
            teacherService.updateTeacher(teacher);
        }
        return new ModelAndView("redirect:/listTeachers");
    }

    @RequestMapping(value = "/listTeachers",  method = RequestMethod.GET)
    public ModelAndView listTeachers(ModelAndView model) {
        List<Teacher> teacherList = teacherService.getAllTeachers();
        model.addObject("teacherList", teacherList);
        model.setViewName("teacherList");
        return model;
    }

    @RequestMapping(value = "/editTeacher")
    public ModelAndView editTeacher(@RequestParam("id") long teacherId) {
        Teacher teacher = teacherService.getTeacher(teacherId);
        ModelAndView model = new ModelAndView("editTeacher");
        model.addObject("teacher", teacher);
        model.addObject("courses", teacher.getCourses());
        return model;
    }
}
