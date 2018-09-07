package Chapter9Cloning;

public class LineItemCloneApp {
    
    public static void main(String args[]) throws CloneNotSupportedException {
     
        System.out.println("Welcome to LineItem Clone Testing");
        
        Product p1 = new Product();
        p1.setCode("Java2");
        p1.setDescription("text2");
        p1.setPrice(84.0);
        
        LineItem li1 = new LineItem();
        li1.setProduct(p1);
        li1.setQuantity(3);
        
        LineItem li2 = (LineItem)li1.clone();
        li2.setQuantity(5);
        li2.getProduct().setPrice(90.0);
        
        System.out.println(li1);
        System.out.println(li2);
        
    }
    }

