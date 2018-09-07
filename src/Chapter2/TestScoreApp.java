package Chapter2;

import java.util.Scanner;

public class TestScoreApp {

public static void main (String[] args){
    
    System.out.println("Enter test scores that range from 0 to 100");
    System.out.println("To end the program, enter 999");
    Scanner sc = new Scanner(System.in);
    
    int input = 0;
    int count = 0;
    int total = 0;
    double average = 0.0;
    while(input<999){
        
        System.out.print("Enter Score: ");
         input = sc.nextInt();
         
    
          if (input <=100){
    
          total = total+input;
          count += 1;
              
          }
          else{
              System.out.println("Invalid entry. Not counted");
          }
          
          if (total >0)
          average = total/count;
    
    
          
    }
    System.out.println("Score Count: " + count);
    System.out.println("Score total: " + total);
    System.out.println("Average Score: " + average);
    
    
    
   
    
    
    
    
    
}


    
}
