package GC;

import java.util.Scanner;

public class RegularExpression {

public static void main (String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a name:");
    String name = sc.next();
    checkName(name);
    System.out.println("Please enter an Email");
    String email = sc.next();
    checkEmail(email);
    System.out.println("Please enter a Phone Number");
    String number = sc.next();
    phoneNumber(number);
    System.out.println("Please enter your Date of Birth");
    String dob = sc.next();
    dateOfBirth(dob);
    System.out.println("Please enter HTML address");
    String html = sc.next();
    validHtml(html);
    
    
}


public static String checkName(String name){
    // Name first letter should be capital and name should be within 30 characters 
    String regExName = "([A-Z][a-z]{1,29})";
    
    if(name.matches(regExName)){
        System.out.println("Hi" + name + "!");
    }
    else
        System.out.println("Please enter a valid Name");
    
    return name;
}
    public static String checkEmail(String email){
        //E-mail combination of alphanumeric characters (between 5 and 30) No special characters
        //@
        // combination of alphanumeric characters length between 5 and 10 No special characters
        // domain name combination of alphanumeric characters with legth of two or three
        // eg. hello@service.com
        
        String regExEmail = "[A-Za-z0-9]{5,30}[@][A-Za-z0-9]{5,10}[\\.][A-Za-z]{0,3}";
        
        if (email.matches(regExEmail)){
            System.out.println("Email is Valid");
        }else
        {
            System.out.println("Please enter a valid Email ID");
        }
      
        return email;
    }
    
    public static String phoneNumber(String number){
        
        String regExPhoneNumber = "[0-9]{3}[-][0-9]{3}[-][0-9]{4}";
        
        if (number.matches(regExPhoneNumber)){
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Please enter a valid number");
        }
        return number;
    }
    
    public static String dateOfBirth(String dob){
        String regExDob = "[0-9]{2}[/][0-9]{2}[/][0-9]{4}";
        
        if(dob.matches(regExDob)){
            System.out.println("Correct");
        }else{
            System.out.println("Valid entry please!");
        }
        return dob;
    }
    
    public static String validHtml(String html){
        
        String regExHtml = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
        if(html.matches(regExHtml)){
            System.out.println("great");
        }else{
            System.out.println("please enter a valid html");
        }
        return html;
    }
    
}
