package Chapter13_Exercise;



import java.util.Scanner;

public class NameParserApp_Exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        
        
        System.out.println();
        
        /*
        int index = name.indexOf(" ");
        int index1 = name.lastIndexOf(" ");
        
        String firstName = name.substring(0, index);
        String middleName = name.substring(0, index1);
        String lastName = name.substring(2, index);
        
        System.out.println("FirstName: " + firstName + "\n" + "MiddleName: " + middleName + "\n" + "LastName: " + lastName + "\n" );
        */
        
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String middleName = nameParts[1];
        String lastName = nameParts[2];
          System.out.println("FirstName: " + firstName + "\n" + "MiddleName: " + middleName + "\n" + "LastName: " + lastName + "\n" );
    }
}
