/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A
 */
public class Application {
   private Student student;
   private List<String> majors;
   private double GPA;
   private int SAT;
   private int ACT;
   
   Application(){
   this.student=null;
   this.majors=new ArrayList<>();
   this.GPA=0.0;
   this.ACT=0;
   this.SAT=0;
   }
   Application(Student student, List<String> majors, int SAT,int ACT,double GPA){
   this.student=student;
   this.majors=majors; 
   this.SAT=SAT;
  this.ACT=ACT;
  this.GPA=GPA;
  
   }
   
   private Student getStudent(){
   return this.student;
   }
   private void setStudent(Student student){
       this.student=student;
   }
    private void setListMajors(List<String> majors){
       this.majors=majors;
   }
     private List<String> getListMajors(){
       return this.majors;
   }
}
