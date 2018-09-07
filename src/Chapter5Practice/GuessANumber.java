package Chapter5Practice;

import java.util.Scanner;

public class GuessANumber {

public static void main (String [] args){

    final int LIMIT = 10;
    displayWelcome(LIMIT);
    int number = getRandomInt(LIMIT);
    System.out.println("My guess is" + number);
    
    Scanner sc = new Scanner(System.in);
    int count = 1;
    while(true){
        System.out.println("Your Guess: ");
        int guess = sc.nextInt();
        
        if(guess <1 || guess > LIMIT){
            System.out.println("Invalid guess. Try again");
            continue;
        }
        
        if (guess < number){
            System.out.println("Too Low");
        }else if (guess > number){
            System.out.println("Too high");
        }else {
            System.out.println("You guessed it right in " + count + "tries \n");
            break;
        }
        count++;
    }
    System.out.println("Bye!");
    
    
}

public static void displayWelcome(int limit){
    System.out.println("Guess the Number!");
    System.out.println("I am thinking of a number from 1 to " + limit);
    System.out.println();
}
    
public static int getRandomInt(int limit){
    double d = Math.random() * limit;
    int randomInt = (int)d;
    randomInt++;
    return randomInt;
}

}
