package Chapter5Practice;

import java.util.Scanner;

public class CheckValidNumericFormat {

    public static double getDouble(Scanner sc, String prompt){
    
        double d = 0;
        boolean isValid = false;
        while (!isValid){
            System.out.println(prompt);
            if(sc.hasNextDouble()){
                d = sc.nextDouble();
                isValid = true;
            }else{
                System.out.println("Error! Invalid Number. Try Again.");
            }
            sc.nextLine();
    }
       return d; 
}
    
    public static double getDoubleWithRange (Scanner sc, String prompt, double min, double max){
        
        double d = 0; 
        boolean isValid = false;
        while (!isValid){
            d = getDouble(sc, prompt);
            if (d <= min){
                System.out.println("Error! Number must me greater than " + min);
            }
            else if (d >= max){
            System.out.println("Eror! Number must be lesser than " + max) ;
            }   
        else{
                isValid = true;
                }
        }
        return d;
    }
    
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
        double subtotal1 = getDouble(sc, "Enter subtotal");
        double subtotal2 = getDoubleWithRange(sc, "Enter subtotal", 0, 1000);
    }
    
    }
