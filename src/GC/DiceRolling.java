package GC;

import java.util.Scanner;
import java.util.Random;

public class DiceRolling {

public static void main (String [] args){

Scanner sc = new Scanner(System.in);
String choice = "Y"    ;
while(choice.equalsIgnoreCase("y")) {
    System.out.println("How many sides should each dice have? ");
    int userDiceInput = sc.nextInt();
    
    int roll1 = (int)(userDiceInput * Math.random() + 1);
    int roll2 = (int)(userDiceInput * Math.random() + 1);
    
    System.out.println("Roll 1 " + "\n"  + roll1 + "\n" + roll2);
    
    System.out.println("Do you want to Roll again: y/n");
    choice = sc.next();
    System.out.println();
}
}




    
}
