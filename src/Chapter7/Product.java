package Chapter7;

import java.text.NumberFormat;

public class Product {
// the instance variables
    
    private String code;
    private String description;
    private double price;
    
// constructor
public Product(){
    code = "";
    description = "";
    price = 0;
    
}    
    
// the set and get methods for the code variable 

    public void setCode (String code){
        
        this.code = code;
    }
    
    public String getCode(){
        return code;
    }

  // set and get methods for description variable
    
    public void setDescription (String description){
        this.description = description;
    }
    
    public String getDescription (){
        return description;
    }
    
    // set and get methods for price variable
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    // a custom get method for the price variable
    
    public String getPriceFormatted(){
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
}
