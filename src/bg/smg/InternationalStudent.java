/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg;



import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author A
 */
public class InternationalStudent extends Student{
    
    private int TOEFlscore;
    private double IELTSscore;
    
 public InternationalStudent() {
        super();
        this.TOEFlscore = 0;
        this.IELTSscore = 0.0;
    }

   


    public InternationalStudent(int TOEFlscore, double IELTSscore) {
        this.TOEFlscore = TOEFlscore;
        this.IELTSscore = IELTSscore;
    }

    public InternationalStudent(int TOEFlscore, double IELTSscore, String email, String firstName, String lastName, LocalDate birthdate) {
        super(email, firstName, lastName, birthdate);
        this.TOEFlscore = TOEFlscore;
        this.IELTSscore = IELTSscore;
    }

    @Override
    public String toString() {
        return "InternationalStudent{" + super.toString()+ "TOEFlscore=" + TOEFlscore + ", IELTSscore=" + IELTSscore + '}';
    }
 
  
   

    public int getTOEFlscore() {
        return TOEFlscore;
    }

    public double getIELTSscore() {
        return IELTSscore;
    }

    public void setTOEFlscore(int TOEFlscore) {
        this.TOEFlscore = TOEFlscore;
    }

    public void setIELTSscore(double IELTSscore) {
        this.IELTSscore = IELTSscore;
    }

  
    
}
