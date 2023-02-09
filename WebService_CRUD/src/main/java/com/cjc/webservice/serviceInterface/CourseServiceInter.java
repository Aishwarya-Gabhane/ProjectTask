package com.cjc.webservice.serviceInterface;

import java.util.List;

import com.cjc.webservice.model.Course;

public interface CourseServiceInter {

public	 void saveCourse(Course c);

public List<Course> getAllCourse();

public void updateCourse(Course c);

public void deleteCourse(int courseid);

}
