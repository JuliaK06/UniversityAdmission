/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg;

import java.time.LocalDate;

/**
 *
 * @author A
 */
public class InternationalStudent extends Student{
    private double TOEFlscore;
    private double IELTSscore;
    
 public InternationalStudent() {
        super();
        this.TOEFlscore = 0.0;
        this.IELTSscore = 0.0;
    }
 
    public InternationalStudent(double TOEFlscore, double IELTSscore, String email, String firstName, String lastName, LocalDate birthdate) {
        super(email, firstName, lastName, birthdate);
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
