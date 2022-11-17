package com.SpringBootProjects.LearnSpringBoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class CoursesService {
List<Courses> courses=new ArrayList<>(Arrays.asList(new Courses(1,"vvjj","fff"),new Courses(2,"yy","cbbb")));

public List<Courses> getAllCourses(){
	return courses;
}

public List<Courses> createCourses(Courses course){
	courses.add(course);
	return courses;
}
}
