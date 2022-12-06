package com.example.course1backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String courseTitle;
    private  String desc;
    private  String venue;
    private  String duration;
    private  String date;

    public Course() {
    }

    public Course(String courseTitle, String desc, String venue, String duration, String date) {
        this.id=id;
       this.courseTitle = courseTitle;
        this.desc = desc;
        this.venue = venue;
        this.duration = duration;
       this.date = date;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
       this.courseTitle = courseTitle;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
       this.venue = venue;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
