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
    public Subject firstprio,secondprio;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Subject firstprio, Subject secondprio) {
        this.name = name;
        this.firstprio = firstprio;
        this.secondprio = secondprio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getFirstprio() {
        return firstprio;
    }

    public void setFirstprio(Subject firstprio) {
        this.firstprio = firstprio;
    }

    public Subject getSecondprio() {
        return secondprio;
    }

    public void setSecondprio(Subject secondprio) {
        this.secondprio = secondprio;
    }
    
    
}
