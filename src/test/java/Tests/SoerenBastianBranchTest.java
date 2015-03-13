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
import Controller.Controller;
import Controller.FileHandler;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
        
   
public class SoerenBastianBranchTest {
    
    
    private Controller controller = new Controller();
    private FileHandler fileHandler = new FileHandler();
    ArrayList<Subject> subjects = new ArrayList<Subject>();
    ArrayList<Subject> acceptedSubjectsSubjects = new ArrayList<Subject>();
    ArrayList <Subject> dummyData = new ArrayList();
    String proposedTestSubjects ="ProposedSubjectsTestFile";
    String AcceptedTestSubjects ="AcceptedSubjectsTestFile";

    @Before
    public  void beforeTest(){
        
        Subject s1 = new Subject("Hans", "Java", "Sjovt","O'riley");
        dummyData.add(s1);

        //Vi har lavet en fil som ser sådan her ud :
        
//        Bastian,Android,Apps til mobiltelefoner,Peter
//        Søren,C#,C#,Torben
//        Charles,Arduino,dimser,Tobias
//        Ruben,AI,kunstig intellegens,Torben
      
    }

    @Test
    public void ReaderTest()
    {
        subjects = fileHandler.Reader(proposedTestSubjects);
        assertEquals(4, subjects.size());
        assertEquals("Bastian", subjects.get(0).getProposer());
        assertEquals("Android", subjects.get(0).getTitle());
    }
   
    @Test
    public void WriterTest()
    {
        
        fileHandler.Writer(dummyData, AcceptedTestSubjects);
        assertEquals(1, fileHandler.Reader(AcceptedTestSubjects).size());
        assertEquals("Hans", fileHandler.Reader(AcceptedTestSubjects).get(0).getProposer());
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
    



