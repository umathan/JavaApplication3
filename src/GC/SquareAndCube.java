package GC;

import java.util.Scanner;

public class SquareAndCube {

public static void main (String[] args)    {
    
int n = 0;

Scanner sc = new Scanner(System.in);
    System.out.println("Please enter an integer below 5:  ");
n = sc.nextInt();

String choice = "y";
int square = 0;
int cube = 0;
int squareResult = 0;
int cubeResult = 0;
System.out.println("Number"+ "\t"+ "Square" + "\t" + "cube");          
while (choice.equalsIgnoreCase("y")){
    
    for (int i = 1; i<=n; i++){
        
         square = i*i;
         cube = i*square;
        
      System.out.println(i + "\t" + square + "\t" + cube);
    }
     
      System.out.println("Do you want to continue: y/n?");  
    choice = sc.next();
    System.out.println();
}
     
}
}
