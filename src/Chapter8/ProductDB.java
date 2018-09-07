package Chapter8;

public class ProductDB {

public static Product getProduct(String productCode){
    Product p = null;
    
    if (productCode.equalsIgnoreCase("java")
        || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")){
    Book b = new Book();
    if(productCode.equalsIgnoreCase("java")){
        b.setCode(productCode);
        b.setDescription("Murach's Java Programming");
        b.setPrice(57.50);
        b.setAuthor("Joel Murach");
    } else if (productCode.equalsIgnoreCase("jsp")){
        b.setCode(productCode);
        b.setPrice(57.50);
        b.setDescription("Murach's Java Servlets and JSP");
        b.setAuthor("Mike Urban");;
    } else if (productCode.equalsIgnoreCase("mysql")){
        b.setCode(productCode);
        b.setDescription("Murach's MySql");
        b.setPrice(54.50);
        b.setAuthor("Joel Murach");
        
    }
    
    p = b; // set Product object equal to the Book object
    }
    else if (productCode.equalsIgnoreCase("netbeans")){
        Software s = new Software();
        s.setCode("netbeans");
        s.setDescription("NetBeans");
        s.setPrice(0.00);
        s.setVersion("8.2");;
        p = s; // set Product object equal to the Software object
    }
    return p;
    
    
}
    
}
