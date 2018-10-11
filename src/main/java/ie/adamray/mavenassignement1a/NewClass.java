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
        CourseProgramme CS = new CourseProgramme("BCT1", 2018, 12, 12);
        CourseProgramme engineering = new CourseProgramme("ENG1", 2018, 12, 12);
        
        Module CT1 = new Module("Programming", "CT1");
        CS.addModules(CT1);
        
        Student Adam = new Student("Adam", 18, 11, 1994, "BCT1");
    }
}
