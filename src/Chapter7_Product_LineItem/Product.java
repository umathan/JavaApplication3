package Chapter7_Product_LineItem;

import java.text.NumberFormat;

public class Product {

    // instance variable
    private String code;
    private String description;
    private double price;
    
    // constructors
    
    public Product(){
        code = "";
        description = "" ;
        price = 0;
        }
    
    public Product(String code, String description, double price){
        this.code = code;
        this.description = description;
        this.price = price;
    }

    
    // getters and setters
    
    public String getCode(){
        return code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    // custom method for price variable
    public String getPriceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    public String getPriceNumberFormat(){
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(2);
        String priceFormatted = number.format(price);
        return priceFormatted;
        
        
    }
    
    
}
