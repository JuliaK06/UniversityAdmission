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
   
   public Student getStudent(){
   return this.student;
   }
   public void setStudent(Student student){
       this.student=student;
   }
    public void setListMajors(List<String> majors){
       this.majors=majors;
   }
     public List<String> getListMajors(){
       return this.majors;
   }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getSAT() {
        return SAT;
    }

    public void setSAT(int SAT) {
        this.SAT = SAT;
    }

    public int getACT() {
        return ACT;
    }

    public void setACT(int ACT) {
        this.ACT = ACT;
    }
     
}
