/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bastian Buhrkall
 */

import org.junit.Test;
import static org.junit.Assert.*;
        
   
public class SoerenBastianBranchTests {
    
 
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
   
    
    @Before
    public  void beforeTest(){
    ArrayList subject = new ArrayList;
    Subject s1 = new Subject("Android", "Apps til mobiltelefoner", "Peter");
    }
    
    
    
    @Test
    public void getAllSubjectsTest()
    {
        
        asserEquals("Android",controller.getAllSubjects()[0].title);
    }
    
    @Test
    public void addToMarkedSubjectsTest(Subject subject){
        
        controller.addToMarkedSubjects(subject);
        assertEquals(5, markedSubject.length());
        
    }

 
        
//        @Test
//    public void send() throws IOException{
//    EchoClient client = new EchoClient();
//    client.connect("localhost",9090);
//    client.send("Hello", d);
    @Test
  public void send() throws IOException{
    EchoClient client = new EchoClient();
    client.connect("localhost",9090);
    client.send("Hello");
    assertEquals("HELLO", client.receive());
  }
  }
    
    

    
    

