package com.yashedu.springboot.learnspringboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yashedu.springboot.learnspringboot.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Now", "yashanghan"));
		repository.insert(new Course(2, "Learn Koka Now", "pramod"));
		repository.insert(new Course(3, "Learn Roma Now", "nikunj"));
	
		repository.deletByID(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));
	}

}
