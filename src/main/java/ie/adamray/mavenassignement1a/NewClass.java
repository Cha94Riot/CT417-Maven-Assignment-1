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
    
    public static List courseList;
    
    public static void main(String args[]){
        List<CourseProgramme> courseList = new ArrayList<CourseProgramme>();
        courseList.add(new CourseProgramme("CS & IT", 2018, 12, 12));
        courseList.add(new CourseProgramme("Science", 2018, 12, 12));
        courseList.add(new CourseProgramme("Economics", 2018, 12, 12));
        courseList.add(new CourseProgramme("Engineering", 2018, 12, 12));
    }
}
