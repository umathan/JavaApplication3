package Ex;

import java.util.Scanner;

public class PyramidPattern1 {

public static void main (String args[]){
    
    Scanner sc = new Scanner(System.in);
    // taking no of rows from the user
    
    System.out.println("Please enter the number of rows");
    int numberOfRows = sc.nextInt();
    // initializing row count
    int rowCount = 1;
    System.out.println("Here is your pyramid");
    for (int i = numberOfRows; i >=0; i--){
        for (int j = 1; j<=i; j++){
            System.out.print("#");
        }
        for (int j = 1; j <=rowCount; j++){
            System.out.print(rowCount + " ");
        
        }
            System.out.println();
            rowCount++;
    }
    
    
    
    
}
    
}
