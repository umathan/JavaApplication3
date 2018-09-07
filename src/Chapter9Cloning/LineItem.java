package Chapter9Cloning;

import java.text.NumberFormat;

public class LineItem implements Cloneable{
    public Product product;
    public int quantity;
    public double total;
    
    public LineItem(){
        this.product = new Product();
        this.quantity = 0;
        this.total = 0;
    }
    
    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
        
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        this.calculateTotal();
        return total;
    }

    public void calculateTotal() {
        total = quantity * product.getPrice();
    }
    
    public String getFormattedTotal(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
    
    
    @Override
    public String toString(){
        return "Code " + product.getCode() + "\n" +
                "Description" + product.getDescription() + "\n" + 
                "Price " + product.getFormattedPrice() + "\n" +
                "Quantity" + getQuantity()  + "\n" +
                "Total " + getTotal();
        }
    
    @Override
    public Object clone()throws CloneNotSupportedException {
        LineItem li = (LineItem) super.clone();
        Product p = (Product)product.clone();
        li.setProduct(p);
        return li;
    }
    
}