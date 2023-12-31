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
public class ApplicationInternational extends Application{
    private double TOEFlscore;
    private double IELTSscore;
    
 public ApplicationInternational() {
        super();
        this.TOEFlscore = 0.0;
        this.IELTSscore = 0.0;
    }

   

    public ApplicationInternational(double TOEFlscore, double IELTSscore, Student student, List<String> majors, int SAT, int ACT, double GPA) {
        super(student, majors, SAT, ACT, GPA);
        this.TOEFlscore = TOEFlscore;
        this.IELTSscore = IELTSscore;
    }
 
  

   

    public double getTOEFlscore() {
        return TOEFlscore;
    }

    public double getIELTSscore() {
        return IELTSscore;
    }

  
    
}
