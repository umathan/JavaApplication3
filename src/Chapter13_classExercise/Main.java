
package Chapter13_classExercise;


public class Main {
    
   
    public static void main(String[] args) {
       
        String productString = "java:Murach's Java Programming:57.50";
        
        Product product = new Product();
        
        //TODO: process productString and populate fields of product object
        
        int index1 = productString.indexOf(":");
        int index2 = productString.indexOf(":", index1+1);
        
        
        String code = productString.substring(0, index1);
        String description = productString.substring(index1+1, index2);
        String price = productString.substring(index2+1);
        
       product.setCode(code);
       product.setDescription(description);
       product.setPrice(Double.parseDouble(price));
        
        
        System.out.println("Code:        " + product.getCode());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price:       " + product.getPriceFormatted());
    }    
    
    
}

    

