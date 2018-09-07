package GC;

import java.util.Scanner;

public class EvenAndOdd {

public static void main (String [] args){
    
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Hi! Please enter your Name");
    String name = sc.next();
   
   // int number = n;
   String choice = "y";
    while(choice.equalsIgnoreCase("y")){
        
    System.out.println("Hi" + name + "!" + "Please enter a number between 1 and 100");
    int n = sc.nextInt();     
    if(n >=1 && n<=100){
    
    if(n % 2 != 0){
        System.out.println(name + "," + "The number " + n + " is odd");
    }
    else if(n % 2 == 0 && (n >=2 && n <=25)){
        System.out.println(name + "," + "The number " + n + " is even and within range 2 and 25");
    }
    else if(n % 2 == 0 &&(n >=26 && n <=60)){
     
        System.out.println(name + "," + "The number " + n + "is even and within range 26 and 60");
    }
    
    else if (n%2 == 0 && (n > 60)){
        System.out.println("The number " + n + "is even");
    }
    else if( n %2 !=0 && (n>60)){
        System.out.println("The number you entered is" + n + "is odd");
    }
    }
    else{
        System.out.println("Pleae enter a number between 1 and 100");
    }
    
        System.out.println("Do you want to continue: Y/N?");
        choice = sc.next();
        System.out.println();
    
}
    
}
    
}
