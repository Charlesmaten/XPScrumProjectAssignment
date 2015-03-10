package Controller;


import Model.Subject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bastian Buhrkall
 */
public class FileHandler {
    
    
    public ArrayList<Subject> Reader(String fileName){
      
        ArrayList<Subject> readerResult = new ArrayList();
        BufferedReader br = null;
 
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(fileName));
 
			while ((sCurrentLine = br.readLine()) != null) {
				
                            
                            String[] params = sCurrentLine.split(",");
                            
                            String proposer = params[0];// Refactoring adder proposer RJ tirs 10-03
                            String title = params[1]; //før 0
                            String description = params[2]; //før 1
                            String teacher = params[3]; //før 2
                            
                            Subject s = new Subject(proposer,title,description,teacher); // Refactoring adder proposer RJ tirs 10-03
                            readerResult.add(s);
                            
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}    

          return readerResult;
      }
    
    
    public void Writer(ArrayList<Subject> subjects, String fileName){
    
        try {

                        String toWrite = "";
                        
                        for(Subject s : subjects)
                        {
                        
                        toWrite += s.getProposer() + "," + s.getTitle() + "," + s.getDescription() + "," + s.getTeacher() + System.lineSeparator();
                        // Refactoring adder proposer RJ tirs 10-03
                        }
         
			File file = new File(fileName);
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(toWrite);
			bw.close();
 
			System.out.println("Added subject/ subjects");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
    
    
}
