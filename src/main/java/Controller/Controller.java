package Controller;


import Model.Subject;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bastian Buhrkall
 */
public class Controller {
    
    ArrayList<Subject> markedSubjects = new ArrayList<Subject>();
    
    public void deleteFromMarkedSubject(ArrayList markedSubjects, int index){
    
    }
    
    public void addSubjectsToSelectionRound(){
    
    }
    
    public void addToMarkedSubjects(Subject subject)
    {
    markedSubjects.add(subject);
    }
    
    public ArrayList getAllSubjects(){
        
        ArrayList<Subject> results = new ArrayList<Subject>();
        return results;
    }
}
