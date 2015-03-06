package Model;


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
    
    
    public ArrayList<Subject> Reader(){
      
        ArrayList<Subject> readerResult = new ArrayList();
        BufferedReader br = null;
 
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:\\Users\\cda\\Desktop\\Testing.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				
                            
                            String[] params = sCurrentLine.split(",");

                            String title = params[0];
                            String description = params[1];
                            String teacher = params[2];
                            
                            Subject s = new Subject(title,description,teacher);
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
    
    
    public void Writer(ArrayList<Subject> subjects){
    
        try {

                        String toWrite = "";
                        
                        for(Subject sub : Reader()){
                       
                        toWrite += sub.title + "," + sub.description + "," + sub.teacher + System.lineSeparator();

                        }
                        
                        for(Subject s : subjects)
                        {
                        
                        toWrite += s.title + "," + s.description + "," + s.teacher + System.lineSeparator();
                        
                        }
                        
			
 
			File file = new File("C:\\Users\\cda\\Desktop\\Testing.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(toWrite);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
    
    
}
