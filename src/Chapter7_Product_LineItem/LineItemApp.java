package Chapter7_Product_LineItem;

public class LineItemApp {

public static void main (String [] args){
    // display welcome message
    System.out.println("Welcome to the Line Item Calculator");
    System.out.println();
    
    // create 1 or more line items
    String choice = "y";
    while (choice.equalsIgnoreCase("y")){
        // get the input from the user
        String productCode = Console.getString("Enter Product Code: ");
        int quantity = Console.getInt("Enter Quantity:   ",0, 1000);
        
    // get the product object
    Product product= null;
    
    // create LineItem object
    
    LineItem lineItem = new LineItem(product, quantity);
    
    // display the output
        System.out.println();
        System.out.println("LINE ITEM");
        System.out.println("Code: "  + product.getCode());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPriceFormatted());
        System.out.println("Quantity " + lineItem.getQuantity());
        System.out.println("Total " + lineItem.getTotalFormatted() + "\n");
        
        
        choice = Console.getString("Continue: y/n");
        System.out.println();
        
        }
        
    }
    
}
