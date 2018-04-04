package com.arun.controller;

import com.arun.model.Course;
import com.arun.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {


    @Autowired
    public CourseService courseService;

    @RequestMapping(value = "/addCourse", method = RequestMethod.GET)
    public String displayClassPage(Model model) {
        model.addAttribute("course", new Course());
        return "class";
    }

    @RequestMapping(value = "/saveClass", method = RequestMethod.POST)
    public ModelAndView saveClass(@ModelAttribute Course course) {
        System.out.println("In class controller");
        courseService.addCourse(course);
        return new ModelAndView("redirect:/");
    }
}
