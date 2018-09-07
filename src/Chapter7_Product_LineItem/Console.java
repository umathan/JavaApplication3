package Chapter7_Product_LineItem;

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner (System.in);
    
    public static String getString(String prompt){
        System.out.println(prompt);
        String s = sc.next();
        sc.nextLine();
        return s;
    }
    
    public static int getInt(String prompt){
        int i = 0;
        boolean isValid = false;
        while(!isValid){
            System.out.println(prompt);
            if(sc.hasNextDouble()){
                i = sc.nextInt();
                isValid = true;
            }else
            {
                System.out.println("Error! Invalid integer. Try Again.");
        }
            sc.nextLine();
        }
        return i;
    }
    
    public static int getInt(String prompt, int min, int max){
        int i = 0;
        boolean isValid = false;
        while(!isValid){
            i = getInt(prompt);
            if(i <= min){
                System.out.println("Error. Number must be greater than " + min + ". ");
        } else if (i >= max){
                System.out.println("Error. Number must be greater than" + min + ".");
        }else {
            isValid = true;
        }
        }
        return i;
    }
    
    public static double getDouble(String prompt){
        double d = 0;
        boolean isValid = false;
        while(!isValid){
            System.out.println(prompt);
            if(sc.hasNextDouble()){
                d = sc.nextDouble();
                isValid = true;
            }else {
                System.out.println("Error, Invalid number.  Try again");
            }
            sc.nextLine();
        }
        return d;
    }
    
    public static double getDouble(String prompt, double min, double max){
        double d = 0;
        boolean isValid = false;
        
        while (!isValid){
            d = getDouble(prompt);
            if (d <= min){
                System.out.println("Error. Number must be greater than " + min + ".");
            }else if (d >= max){
                System.out.println("Error. Number must be lesser than "  + max + ".");
            }else {
                isValid = true;
            }
          }
          return d;
    }
}
