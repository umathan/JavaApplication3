package Chapter7_Product_LineItem;

import java.util.Scanner;

public class ProductApp {
    
public static void main (String [] args)    {
    // display welcome message
    System.out.println("Welcome to the product viewer");
    System.out.println();
    
    // display 1 or more products
    Scanner sc = new Scanner(System.in);
    String choice = "y";
    while (choice.equalsIgnoreCase("y")){
        // get input from the user
        
        System.out.println("Enter Product Code");
        String productCode = sc.next();
        sc.nextLine();
        
        // get the product object
        ProductDB db = new ProductDB();
        Product product = db.getProduct(productCode);
        
        // display the output
        System.out.println();
        System.out.println("SELECTED PRODUCT");
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price:  " + product.getPriceNumberFormat());
        System.out.println();
        
        // see if the user wants to continue
        System.out.println("Continue: y/n");
        choice = sc.next();
        System.out.println();
    }
}
    
}
