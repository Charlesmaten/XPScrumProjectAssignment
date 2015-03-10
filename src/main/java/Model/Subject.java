package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bastian Buhrkall
 */
public class Subject {
    String proposer; 
    String title;
    String description;
    //Teacher teacher;
    String teacher;
    

    public Subject(String proposer, String title, String description, String teacher) {  // Refactoring adder proposer RJ tirs 10-03
        this.proposer = proposer;
        this.title = title;
        this.description = description;
        this.teacher = teacher;
    }

    public String getProposer() {
        return proposer; 
    }

    public void setProposer(String proposer) {
        this.proposer = proposer; 
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    
    
}
