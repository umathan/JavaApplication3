package Ex;

import java.util.Scanner;

public class ReverseString {

public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a word");
   String strg = sc.next();
    System.out.println(reverseString(strg));
}

public static String reverseString (String strg){
    
    String newString = "";
   
    for( int i =strg.length()- 1; i >=0; i--){
    
    newString = newString + strg.charAt(i);
    
    
    }
     return newString;
}
    
}
