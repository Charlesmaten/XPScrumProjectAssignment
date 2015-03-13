/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Phill
 */
public class UserSatisfaction {
    public final Student student;
    private int firstPrios, secondPrios;

    public UserSatisfaction(Student student) {
        this.student = student;
    }

    public UserSatisfaction(Student student, int firstPrios, int secondPrios) {
        this.student = student;
        this.firstPrios = firstPrios;
        this.secondPrios = secondPrios;
    }
    

    public int getFirstPrios() {
        return firstPrios;
    }

    public void setFirstPrios(int firstPrios) {
        this.firstPrios = firstPrios;
    }

    public int getSecondPrios() {
        return secondPrios;
    }

    public void setSecondPrios(int secondPrios) {
        this.secondPrios = secondPrios;
    }
    
    
}