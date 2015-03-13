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
public class Student {
    public String name;
    public Subject firstprio1,firstprio2,secondprio1,secondprio2;

      
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Subject firstprio1, Subject firstprio2, Subject secondprio1, Subject secondprio2) {
        this.name = name;
        this.firstprio1 = firstprio1;
        this.firstprio2 = firstprio2;
        this.secondprio1 = secondprio1;
        this.secondprio2 = secondprio2;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getFirstprio1() {
        return firstprio1;
    }

    public void setFirstprio1(Subject firstprio1) {
        this.firstprio1 = firstprio1;
    }

    public Subject getFirstprio2() {
        return firstprio2;
    }

    public void setFirstprio2(Subject firstprio2) {
        this.firstprio2 = firstprio2;
    }

    public Subject getSecondprio1() {
        return secondprio1;
    }

    public void setSecondprio1(Subject secondprio1) {
        this.secondprio1 = secondprio1;
    }

    public Subject getSecondprio2() {
        return secondprio2;
    }

    public void setSecondprio2(Subject secondprio2) {
        this.secondprio2 = secondprio2;
    }

 
    
}
