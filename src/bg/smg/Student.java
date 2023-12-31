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
public class Student {
private String email;
private String firstName;
private String lastName;
private LocalDate birthDate;

  public Student() {
        this.email="";
        this.firstName=" ";
        this.lastName=" ";
        this.birthDate=null;
    }
  
    public Student(String email, String firstName, String lastName, LocalDate birthdate) {
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthdate;
    }
  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
}
