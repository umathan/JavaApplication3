package Chapter8_Inheritance;

import java.util.Scanner;

public class ProductApp {
    
    public static void main (String args[]){
        
       
        
        System.out.println("Welcome to the Product Viewer");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Enter product code:  ");
            String productCode = sc.nextLine();
            
            Product p = ProductDB.getProduct(productCode);
            
            System.out.println();
            if (p!= null){
                System.out.println("Description: " + p.toString());
                System.out.println("Price:  " + p.getPriceFormatted());
        } else{
                System.out.println("No Product matchs this product code.");
            }
            
            System.out.println();
            System.out.println("Product Count:  " + Product.getCount() + "\n");
            
            System.out.println("Continue: y/n");
            choice = sc.nextLine();
            System.out.println();
    }
    
    
}
}
