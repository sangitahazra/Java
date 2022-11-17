package com.SpringBootProjects.LearnSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CoursesControler {
@Autowired
CoursesService cs;
@GetMapping("/get")
public List<Courses> getallcourses(){
	return cs.getAllCourses();
}

@RequestMapping("/create")
public List<Courses> createCourses(@RequestBody Courses course){
	return cs.createCourses(course);
}

}
