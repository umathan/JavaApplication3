
package Chapter9_Interface;

import java.text.NumberFormat;

public class Product implements Displayable{

public String code;
public String description;
public double price;

public Product(){
    this.code = "";
    this.description = "";
    this.price = 0.0;
    }

public Product (String code, String description, double price){
    this.code = code;
    this.description = description;
    this.price = price;
}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    @Override
    public String toString(){
        return getDescription();
    }
}
    