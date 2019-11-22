package com.sha.serverside.service;

import com.sha.serverside.model.Course;
import com.sha.serverside.model.Module;
import com.sha.serverside.model.ModuleContent;

import java.util.List;

public interface CourseService {
    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();

    Course findCourseById(Long courseId);

    List<Module> findAllModules(Long courseId);

    List<ModuleContent> getModuleContent(Long moduleId);

    Module findModuleById(Long moduleId);
}
