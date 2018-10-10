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
    private String courseName;
    private List<Student> students = new ArrayList<Student>();
    private List<Module> modules = new ArrayList<Module>();
    private DateTime startDate;
    private DateTime endDate;
    
    public CourseProgramme(String courseName, int startYear, int startMonth, int startDay){
        this.courseName = courseName;
        this.startDate = new DateTime(startYear, startMonth, startDay, 0, 0);;
        this.endDate = new DateTime(startYear, startYear, startYear, 59, 59);;
    }
}
