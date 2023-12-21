/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg;

import java.util.ArrayList;

/**
 *
 * @author A
 */
public class University {
    private  ArrayList<Application> applications;
    
    
    
    
public University(){
this.applications=null;
}
    public University(ArrayList<Application> applications) {
        this.applications = applications;
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }

    public void setApplications(ArrayList<Application> applications) {
        this.applications = applications;
    }
    
    
    
    
    
}
