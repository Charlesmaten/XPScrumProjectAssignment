package Controller;


import GUI.AcceptSubjectGUI;
import Model.Student;
import Model.Subject;
import Model.UserSatisfaction;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import sun.security.util.Resources;

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
    
    public List<UserSatisfaction> getUserSatisfaction(List<Subject> poolA, List<Subject> poolB)
    {
        List<UserSatisfaction> retlist = new ArrayList<>();
        
        //dummy data
        Student x = new Student("Charles");
        Student y = new Student("Phill");
        Student z = new Student("Bastian");
        
        retlist.add(new UserSatisfaction(x, true, false));
        retlist.add(new UserSatisfaction(y, true, true));
        retlist.add(new UserSatisfaction(z, false, false));
        
        return retlist;
    }
}
