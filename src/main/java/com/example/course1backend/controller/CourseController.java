package com.example.course1backend.controller;

import com.example.course1backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/vie")
    public String View(){
        return "view page";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Course c){
        System.out.println(c.getCourseTitle().toString());
        return "add page";
    }

}
