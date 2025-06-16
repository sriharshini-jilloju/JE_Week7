package com.va.week7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value="/student", method=RequestMethod.GET)
    public Student getStudent() {
        Student s1 = new Student();
        s1.setStudentID(1001);
        s1.setFname("Sri Harshini");
        s1.setLname("Jilloju");
        s1.setPhone("333-333-3333");
        s1.setDob("2001-04-30");
        s1.setStreet("Humber");
        s1.setCity("Torono");
        s1.setNo("48");
        return s1;
    }
}