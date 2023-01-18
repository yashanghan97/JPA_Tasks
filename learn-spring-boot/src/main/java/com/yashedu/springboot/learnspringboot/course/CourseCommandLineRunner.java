package com.yashedu.springboot.learnspringboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yashedu.springboot.learnspringboot.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Now", "yashanghan"));
		repository.insert(new Course(2, "Learn Koka Now", "pramod"));
		repository.insert(new Course(3, "Learn Roma Now", "nikunj"));
	
		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));
	}

}
