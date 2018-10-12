/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.adamray.mavenassignement1a;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Adam
 */
public class TestClass {
    
    // Declares Test varialbles
    private CourseProgramme CS, eng;
    private Module CT1, CT2, MA1, TH1, PHY1, AI1;
    private Student Adam, Ryan;
    
    @Test
    public void usernameTest() {} {
        // Creates new Courses with Code and Dates
        CS = new CourseProgramme("BCT1", 10, 9, 2018, 15, 5, 2019);
        eng = new CourseProgramme("ENG1", 10, 9, 2018, 15, 5, 2019);
        // Creates new Modules with Name and ID, then adds them to a Course Object
        CT1 = new Module("Programming", "CT1");
        CT2 = new Module("Software Engineering", "CT2");
        MA1 = new Module("Math", "MA1");
        TH1 = new Module("Thermodynamics", "TH1");
        PHY1 = new Module("Physics", "PHY1");
        AI1 = new Module("Artificial Intelligence", "AI1");
        // Populates CS and ENG courses with modules
        CS.addModules(CT1);
        CS.addModules(CT2);
        CS.addModules(MA1);
        CS.addModules(AI1);        
        eng.addModules(CT1);
        eng.addModules(MA1);
        eng.addModules(TH1);
        eng.addModules(PHY1);
        // Creates a new Student with Name, DOB and course
        Adam = new Student("Adam", 18, 8, 1995, CS);
        Ryan = new Student("Ryan", 1, 1, 1999, eng);
        
        assertEquals("Adam-23", Adam.getUsername());
        assertEquals("Ryan-19", Ryan.getUsername());
    }
}
