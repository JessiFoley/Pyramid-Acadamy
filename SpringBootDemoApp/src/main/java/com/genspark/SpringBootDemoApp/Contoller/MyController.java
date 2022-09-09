package com.genspark.SpringBootDemoApp.Contoller;

import com.genspark.SpringBootDemoApp.Entity.Course;
import com.genspark.SpringBootDemoApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/")
    public String home()
    {
        return "<HTML><CENTER><H1>Welcome to Course Application</H1></CENTER></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourse();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID)
    {
        return this.courseService.getCourseByID(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable String courseID) {
        return this.courseService.deleteCourseByID(Integer.parseInt(courseID));
    }
}
