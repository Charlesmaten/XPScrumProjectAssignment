package Controller;


import GUI.AcceptSubjectGUI;
import Model.Subject;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

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
    
     public String bastianSørenProposedFile = "C:\\Users\\Bastian Buhrkall\\Documents\\NetBeansProjects\\XPScrumProjectAssignment3\\src\\main\\java\\Model\\ProposedSubjects";
     public String bastianSørenAcceptedFile = "C:\\Users\\Bastian Buhrkall\\Documents\\NetBeansProjects\\XPScrumProjectAssignment3\\src\\main\\java\\Model\\AcceptedSubjects";
     public String rubenCharlesProposedFile = ""; //INDSÆT JERES FILSTI HER!
     
   FileHandler fileHandler = new FileHandler();

   
    public void populateList(ArrayList array, DefaultListModel listModel)
    {
        
        for(int i =0; i<array.size(); i++)
        {
             Model.Subject s1 = (Model.Subject) array.get(i);
             
             listModel.addElement(s1.getTitle());
        }        
    }

    public void addAllSubjects(){
        ArrayList <Subject> allAddArray = fileHandler.Reader(bastianSørenProposedFile);
        fileHandler.Writer(allAddArray, bastianSørenAcceptedFile);
    }
}
