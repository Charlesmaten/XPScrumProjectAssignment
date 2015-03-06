/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bastian Buhrkall
 */

import Model.Subject;
import Model.Controller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
        
   
public class SoerenBastianBranchTest {
    
 
//reader
//writer

    
    // class FileWriter()
    //{
    // IO writer
    //}
    
    //ArrayList markedSubjects;
    
    //getAllSubjects()
    //{
    //  læser, putter i arrayList, returnerer arraylist af Subjects
    // Subject har string title, String description, Teacher teacher
    //}
    
    //void addToMarkedSubjects(Subject subject)
    //{
    //markedSubjects.add(subject)
    //}
    
    // void deleteFromMarkedSubject(ArrayList markedSubjects, int index)
    //{
    //for loop der slettter index....
    //}
    
    //addSubjectsToSelctionRound(ArrayList markedSubjects)
    //{
    //   skriver subject til textfil med IO.
    //}
 
    
    private Controller controller = new Controller();
    ArrayList<Subject> subjects = new ArrayList<Subject>();
    ArrayList<Subject> markedSubjects = new ArrayList<Subject>();
    
    @Before
    public  void beforeTest(){
    
    Subject s1 = new Subject("Android", "Apps til mobiltelefoner", "Peter");
    Subject s2 = new Subject("C#", "c#", "Torben");
    Subject s3 = new Subject("Arduino", "dimser", "Tobias");
    Subject s4 = new Subject("AI", "kunstig intellegens", "Torben");

    subjects.add(s1);
    subjects.add(s2);
    subjects.add(s3);
    subjects.add(s4);
    
    markedSubjects.add(s1);
    markedSubjects.add(s2);
    markedSubjects.add(s3);
    markedSubjects.add(s4);
    
    
    
    
    
    
    


    }

    @Test
    public void getAllSubjectsTest()
    {
        
        assertEquals(4, controller.getAllSubjects().size());
    }
    
    @Test
    public void addToMarkedSubjectsTest(){
        Subject testSubject = new Subject("","","");
        controller.addToMarkedSubjects(testSubject);
        assertEquals(5, markedSubjects.size()); 
    }

    
  }

//package Translation;
//
//import org.jmock.Expectations;
//import org.jmock.integration.junit4.JUnitRuleMockery;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class GreetingTest {
//    
//    public JUnitRuleMockery context = new JUnitRuleMockery();
//    private final String FROM_LANGUAGE = "English";
//    private final String TO_LANGUAGE = "Danish";
//    private final String NAME = "Anders";
//
//    public GreetingTest() {
//    }
//
//    @Test
//    public void testSayHello() {
//        //setup
//        final ITranslator mockTranslator = context.mock(ITranslator.class);
//        Greeting greeting = new Greeting(mockTranslator);
//        //setup exceptions about collaborating behavior
//        context.checking(new Expectations(){{
//            oneOf(mockTranslator).translate(FROM_LANGUAGE, TO_LANGUAGE, "Hello");
//            will(returnValue("Hej "+NAME));
//        }});
//        //Execute
//        greeting.sayHello(TO_LANGUAGE, NAME);
//        //verify
//        context.assertIsSatisfied();
//        
//    }
//    
//}
    
    

    
    

