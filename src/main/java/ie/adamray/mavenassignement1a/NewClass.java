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
public class NewClass {
    
    public static void main(String args[]){
        // Creates new Courses with Code and Dates
        CourseProgramme CS = new CourseProgramme("BCT1", 12, 12, 12);
        
        // Creates new Modules with Name and ID, then adds them to a Course Object
        Module CT1 = new Module("Programming", "CT1");
        CS.addModules(CT1);
        
        // Creates a new Student with Name, DOB and course
        Student Adam = new Student("Adam", 18, 11, 1994, CS);
        
        System.out.println(Adam.getUsername());
        System.out.println(Adam.getUsername());

    }
}
