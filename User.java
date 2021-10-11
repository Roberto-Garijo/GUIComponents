/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Alumne
 */
public class User {
    
    //private int id;
    private String id, firstName, lastName, gender;
    private LocalDate birthDate;
    private boolean isAlive;

    public User(String id, String firstName, String lastName, String gender, LocalDate birthDate, boolean isAlive) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.isAlive = isAlive;
    }
    
    @Override
    public String toString() {
        //return "User{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", birthDate=" + birthDate + ", isAlive=" + isAlive + '}';
        
        String Alive;
        if (isAlive == true)
            Alive = "Alive";
        else
            Alive = "Dead";
        LocalDate now = LocalDate.now();
        Period diferencia = Period.between(birthDate, now);
        
        return id + ": " + lastName + ", " + firstName + " - " + diferencia.getYears() + " years old - " + gender + " - " + Alive + "\n";
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
