/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.adamray.mavenassignement1a;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author Adam
 */
public class CourseProgramme {
    private String courseCode;
    private List<Student> students = new ArrayList<Student>();
    private List<Module> modules = new ArrayList<Module>();
    private DateTime startDate;
    private DateTime endDate;
    
    // Constructor adding Course Code, Start and End Dates
    public CourseProgramme(String courseCode, int startYear, int startMonth, int startDay){
        this.courseCode = courseCode;
        this.startDate = new DateTime(startYear, startMonth, startDay, 0, 0);;
        this.endDate = new DateTime(startYear, startYear, startYear, 23, 23);;
    }
    
    // Setter method to add a module to this Course's module list
    public void addModules(Module module){
        this.modules.add(module);
        module.addCourse(this); // Once the module is added, it sends the current course Object to the Module object method.  
    }
    
    // Setter method to register a Student to this course
    public void addStudentCourse(Student student){
        this.students.add(student);
        for(Module listElement : modules){ // For all modules currently associated with this course, it sends the Student Object to the Module Object method.
            listElement.addStudentModule(student);
        }
    }
    
    // Getter method for Course Code.
    public String getCourseCode(){
        return courseCode;
    }
    // Getter method to return list of Students in this Course
    public List<Student> getStudentList(){        
        return students;
    }
    // Getter method to return list of Modules associated this Course
    public List<Module> getModuleList(){        
        return modules;
    }
    // Getter method for Course Start Date
    public DateTime getStartDate(){
        return startDate;
    }
    // GEtter Method for Course End Date
    public DateTime getEndDate(){
        return endDate;
    }
}