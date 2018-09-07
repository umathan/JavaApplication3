/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.*;
        
public class Factorial {

    public static void main (String[] args){
        
        System.out.println("Factorial Calculation");
        
        Scanner sc = new Scanner(System.in);
        
      
        
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
          System.out.print("Enter a number greater than 0 and less than 10: ");
        int enteredNumber = sc.nextInt();
            int i = 1;
            int factorial = 1;
            for (i = 1; i <=9; i++){
                factorial = factorial * i;
                
            }
            System.out.println("Factorial of  " + enteredNumber + " is: " + factorial);
        
            System.out.print("Continue y/n: ");
            choice = sc.next();
        }
        
        
        
    }

    
}
