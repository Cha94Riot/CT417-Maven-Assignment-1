/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.adamray.mavenassignement1a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Module {
    private String moduleName;
    private String moduleID;
    private List<Student> students = new ArrayList<Student>();
    private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    
    // Constructor, adds Module Name and Module Code to the object
    public Module(String moduleName, String moduleID){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    // Setter method to add the Course object to this Module
    public void addCourse(CourseProgramme course) {
        this.courses.add(course);
    }
    
    // Setter method to add a Student object to the Modules student list
    public void addStudentModule(Student student){
        this.students.add(student);
    }
    
    // Getter method to get Module Name 
    public String getModuleName(){
        return moduleName;
    }
    // Getter method to get Module Code
    public String getModuleID(){
        return moduleID;
    }
    // Getter method for Students registered to this module
    public List<Student> getStudentList(){
        return students;
    }
    // Getter method for Courses associated with this module
    public List<CourseProgramme> getCourseList(){
        return courses;
    }
}