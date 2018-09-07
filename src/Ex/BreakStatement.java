package Ex;

import java.util.Scanner;

public class BreakStatement {

public static void main (String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    while(true){
        
        System.out.print("Please enter a color: ");
        String color = sc.nextLine();
        if(color.equalsIgnoreCase("exit")){
            break;
        }
        System.out.println("You entered  " + color + "  color");
        
    }
    System.out.println("Bye!");
    
}
    
}
