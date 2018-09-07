package Chapter8b;

import java.util.Scanner;

public class Console8b {

private static Scanner sc = new Scanner(System.in);

public static String getString(String prompt){
    System.out.print(prompt);
    String s = sc.next(); // read user entry
    sc.nextLine(); // discard any ther data entered on the line
    return s;
   
    }

public static String getEntry(Scanner sc, String prompt){
    
    String entry = null;
    boolean isValid = false;
    while (!isValid){
        System.out.print(prompt);
        entry = sc.next();
        if (entry.equals(" ")){
            System.out.println("Error! Invalid entry. Please try again");
        }
        else {
            isValid = true;
        }
        sc.nextLine();
    }
    return entry;
    
}


public static String getStringOnly(Scanner sc, String prompt, String c, String e){
    String entry = null;
    
    boolean isValid = false;
    while (!isValid){
        
        entry = getEntry(sc, prompt);
        if(! entry.equalsIgnoreCase(c) && ! entry.equalsIgnoreCase(e) ){
            System.out.println(" Error! Entry must be 'c' or 'e'. Please try again.");
    }else {
            isValid = true;
        
    }
    }
        return entry;
 }
}

