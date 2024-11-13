package com.springrest.springrest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
    public Course getCourse(long courseId) {
        Optional<Course> optionalCourse = courseDao.findById(courseId);
        if (optionalCourse.isPresent()) {
            return optionalCourse.get();
        } else {
            throw new RuntimeException("Course not found with ID: " + courseId);
        }
    }

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
    public void deleteCourse(long courseId) {
        Optional<Course> optionalCourse = courseDao.findById(courseId);
        if (optionalCourse.isPresent()) {
            courseDao.delete(optionalCourse.get());
        } else {
            throw new RuntimeException("Course not found with ID: " + courseId);
        }
    }

}
