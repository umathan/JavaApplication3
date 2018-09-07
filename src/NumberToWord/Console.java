package NumberToWord;

import java.util.Scanner;

public class Console {

    static Scanner sc  = new Scanner(System.in);
    
public static String getString(String prompt){

    System.out.println(prompt);
    String s = sc.next();
    sc.nextLine();
    return s;
}

public static int getInt(String prompt){
    int i = 0;
    boolean isValid = false;
    while (!isValid){
        System.out.println(prompt);
        if (sc.hasNextInt()){
            i = sc.nextInt();
            isValid = true;
        }
        else{
            System.out.println("Invalid entry. Please enter a valid number");
        }
        sc.nextLine();
 }
     return i;
    }

public static int getIntWithin(String prompt, int min, int max){
    int i = 0;
    boolean isValid = false;
    while (!isValid){
        i = getInt(prompt);
        if (i < min){
            System.out.println("Please enter a number greater than" + min);
        }
        else if (i > max){
            System.out.println("Please enter a number lesser than" + max);
        }
        else{
            isValid = true;
        }
    }
    return i;
    
    
    
}

    
}
