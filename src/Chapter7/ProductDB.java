
package Chapter7;


public class ProductDB {
   
    public static Product getProduct(String productCode){
        
        // create the Product object
        
        Product p = new Product();
        
        // fill the Product object with data
        
        p.setCode(productCode);
        
        if(productCode.equalsIgnoreCase("java")){
            
            p.setDescription("Murach's Java Programming");
            p.setPrice(57.50);
        }
        
        else if (productCode.equalsIgnoreCase("jsp")){
            p.setDescription("Murach's Java Serlets and JSP");
            p.setPrice(57.50);
        }
        
        else if (productCode.equalsIgnoreCase("mysql")){
            p.setDescription("Murach's MySQL");
            p.setPrice(54.50);
        }
        
        else {
            p.setDescription("Unknown");
        }
            
        return p;
        
        
    }
    
    
}
