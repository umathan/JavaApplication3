package Ex;

import java.util.Scanner;

public class GuessANumber {

public static void main(String[] args){
    
    final int LIMIT = 10;
    
    System.out.println("Guess the number");
    System.out.println("I'm thinking of a number from 1 to " + LIMIT);
    System.out.println();
    
    // get a random number between 1 and the limit
    double d = Math.random() * LIMIT;
    System.out.println(d);
    int number = (int)d;
    number++;
    
    Scanner sc  = new Scanner(System.in);
    int count = 1;
    while(true){
        System.out.print("Your guess: ");
        int guess = sc.nextInt();
        
        if(guess <1 || guess > LIMIT){
            System.out.println("Invalid guess. Try again. ");
            continue;
        }
        
        if (guess < number){
            System.out.println("Too low.");
        } else if (guess > number){
            System.out.println("Too high.");
        } else {
            System.out.println("You guessed it in " + count + " tries. \n");
            break;
        }
       
    }
     count++;
    System.out.println("Bye!");
    
    
}
    
}
