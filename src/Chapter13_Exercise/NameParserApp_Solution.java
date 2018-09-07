package Chapter13_Exercise;

import java.util.Scanner;

public class NameParserApp_Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter a Name: ");
        String name = sc.nextLine();
        name = name.trim();
        
        int index1 = name.indexOf(" ");
        if(index1 == -1){
        
            System.out.println("Name not in a valid format");        
    }   else {
            int index2 = name.indexOf(" ", index1+1);
            if(index2 == -1){
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("FirstName: " + firstName +"\n" + "LastName: " + lastName);
            }
            else{
                int index3 = name.indexOf(" ", index2+1);
                if(index3 == -1){
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1+1, index2);
                    String lastName = name.substring(index2 +1);
                    
                    System.out.println("FirstName: " + firstName);
                    System.out.println("MiddleName: " + middleName);
                    System.out.println("lastName: " + lastName);
                    
                }
                else{
                    System.out.println(" Not a valid name entry");
                }
            }
        }
            
        }
}
