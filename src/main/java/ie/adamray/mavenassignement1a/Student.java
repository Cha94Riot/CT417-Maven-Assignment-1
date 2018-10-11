/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.adamray.mavenassignement1a;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.*;
/**
 *
 * @author Adam
 */
public class Student {
    
    private String name;
    private int age;
    private DateTime DOB;
    private String username;
    private CourseProgramme course;
    private List<Module> modules = new ArrayList<Module>();
 
    // Constructor
    public Student(String name, int day, int month, int year, CourseProgramme course){
        this.name = name;
        this.DOB = new DateTime(year, month, day, 0, 0);
        this.age = setAge();
        setUsername();
        this.course = course;
        registerCourse();
    }

    // Sets the age of the student based on the entered Date of Birth and todays date
    private int setAge() {
        DateTime now = new DateTime();
        now = DOB.minus(now.getYear());
        return now.getYear();
    }

    // Sets the username by concatenating Students name and age
    public void setUsername() {
        this.username = this.name + Integer.toString(this.age);
    }
    
        private void registerCourse() {
        modules = this.course.getModuleList();
        this.course.addStudentCourse(this); 
    }
     
    // Getter method for student name
    public String getStudentName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // Getter method to give Student Username
    public String getUsername() {
        return username;
    }    
}
