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
    
    //Constructor
    public Module(String moduleName, String moduleID){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }
    
    
}
