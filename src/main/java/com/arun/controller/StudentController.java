package com.arun.controller;

import com.arun.model.Student;
import com.arun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {

    public StudentController() {
        System.out.println("Student Controller");
    }


    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String displayStudentPage(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @RequestMapping(value="/saveStudent", method = RequestMethod.POST)
    public ModelAndView saveStudent(@ModelAttribute Student myStudent) {
        System.out.println("In controller");
        studentService.addStudent(myStudent);
        return new ModelAndView("redirect:/");
    }

}
