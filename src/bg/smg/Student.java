/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg;


import java.util.Date;



/**
 *
 * @author A
 */
public class Student {
private String email;
private String firstName;
private String lastName;
private Date birthDate;

  public Student() {
        this.email="";
        this.firstName=" ";
        this.lastName=" ";
        this.birthDate=null;
    }
  
    public Student(String email, String firstName, String lastName, Date birthdate) {
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthdate;
    }

    @Override
    public String toString() {
        return "Student{" + "email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + '}';
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}
