
package Chapter5Exercise;

import java.text.NumberFormat;
import java.util.Scanner;


public class DataValidationExercise {
    
    
    public static void main(String [] args){
     
        System.out.println("Welcome to the Area and Perimieter Calculator");
        
         Scanner sc = new Scanner(System.in);
         String choice = "y";
         
         while (choice.equalsIgnoreCase("y")){
             
             double length = getDoubleWithinRange(sc, "Enter Length", 0, 1000000);
             double width = getDoubleWithinRange(sc, "Enter width", 0, 1000000);
         
             //calculate the area and perimeter
             double area = length * width;
             double perimeter = (2 *length) + (2 * width);
         
             NumberFormat n = NumberFormat.getNumberInstance();
             n.setMaximumFractionDigits(2);
               // n.format(area);
             //n.format(perimeter);
             
             System.out.println("Area is " + n.format(area));
             System.out.println("Perimeter is " + n.format(perimeter));
             
             
             choice = getChoiceString(sc, "Continue? (y/n): ", "y", "n");
                         
               
             
         }
         
         
        
    }
   
    
   public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
       
       double d = 0;
       boolean isValid = false;
       
       while(!isValid){
           
           //System.out.println("Enter Length: ");
           d = getDouble(sc, prompt);
           if(d <= min){
               System.out.println("Error!. Number must be greater than  " + min + ".");
           }
           else if (d >= max){
               System.out.println("Error!. Number must be less than 1000000" + max + ".");
           }
           
           else 
           {
               isValid = true;
           }
           
       }
       return d;
   }
   
   
       public static double getDouble(Scanner sc, String prompt){
           double d = 0;
           boolean isValid = false;
           while(!isValid){
               System.out.println(prompt);
               if(sc.hasNextDouble()){
                   d = sc.nextDouble();
                   isValid = true;
               }
               else{
                   System.out.println("Error.  Invalid entry. Try again");
               }
               sc.nextLine();
           }
           return d;
       }
       
      private static String getRequiredString(Scanner sc, String prompt){
          
          String s = "";
          boolean isValid = false;
          while(!isValid){
              System.out.println(prompt);
              
              s = sc.nextLine();
              if(s.equals(" ")){
                  System.out.println("Error. Entry is required. Try again");
              }
              else{
                  isValid = true;
              }
          }
          return s;
          
      }
       
       private static String getChoiceString(Scanner sc, String prompt, String s1, String s2){
           
           String s = "";
           boolean isValid = false;
           while(!isValid){
               s = getRequiredString(sc, prompt);
               if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)){
                   System.out.println("Error. Entry must be  " + s1 + "'or ' " + s2 + " Try again.");
               }
               else{
                   isValid = true;
           }
           }
       return s;
       }
       
       
   }
    
    


