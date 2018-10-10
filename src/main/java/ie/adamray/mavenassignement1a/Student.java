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
    private int ID;
    private String username;
    private String courses;
    private List<Module> modules = new ArrayList<Module>();
 
    //Constructor
    public Student(String name, int day, int month, int year){
        this.name = name;
        this.DOB = new DateTime(year, month, day, 0, 0);
        this.age = setAge();
        //this.username = setUsername();
    }

    //Sets the age of the student based on the entered Date of Birth and todays date
    private int setAge() {
        DateTime now = new DateTime();
        now = DOB.minusYears(now.getYear());
        return now.getYear();
    }

    //Gets the username by concatinating Students name and age
    public String getUsername() {
        String username = this.name + Integer.toString(this.age);        
        return username;
    }
    
    public void addModule(List<String> moduleID){
        modules.add(moduleID);
    }
}
