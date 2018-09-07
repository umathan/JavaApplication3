package Chapter9Cloning;

public class ProductCloneApp {
    
  public static void main (String [] args)throws CloneNotSupportedException {
       
      System.out.println("Welcome to Product Clone Testing");
      
      Product p1 = new Product();
      p1.setCode("Java");
      p1.setDescription("textBook");
      p1.setPrice(51.0);
      
      Product p2 = (Product)p1.clone();
      p2.setPrice(57.6);
      
      if(p1.getPrice() == p2.getPrice()){
          System.out.println("Clone is not working");
      } else if (p1.getPrice() != p2.getPrice()){
          System.out.println("Clone is working");
      }
      System.out.println();
       
}
}
