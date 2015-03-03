
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
public class Program {
    
  
    public static void main(String[] args) {
        System.out.println("fdsdfada");
                
   
        FileHandler fileHandler  = new FileHandler();
//        fileHandler.Reader();
        
        Subject s1 = new Subject("Test", "Test","Test");
        Subject s2 = new Subject("Test2", "Test2","Test2");
        Subject s3 = new Subject("Test3", "Test3","Test3");
        
        ArrayList<Subject> arr = new ArrayList();
        
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        
        fileHandler.Writer(arr);

    }
}
