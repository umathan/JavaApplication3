package Chapter17_3ClassExercise;

import java.io.*;
import java.nio.file.*;

public class RectangleIO {

    
    //public static final String fileName = "rectangles.txt";

public static void save(Rectangle r){
 
  //File rectanglesFile = rectanglesPath.toFile();
  
 try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("rectangles.txt", true)))) {
     out.println(r.getLength());
     out.println(r.getWidth());
     out.println(r.getAreaNumberFormat());
     out.println(r.getPerimeterNumberFormat());
 }
 
 catch(IOException e){
            System.out.println(e);
            
}
 
}
 
public static void printFile(){
    
 
     try (BufferedReader in = new BufferedReader(new FileReader("rectangles.txt")))
     {
         String line = in.readLine();
         while(line != null){
             System.out.println(line);
             line = in.readLine();
         }
     }
         catch (IOException e){
                 System.out.println(e);
                 }
        
    
 }
}
    

