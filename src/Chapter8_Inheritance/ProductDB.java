package Chapter8_Inheritance;

public class ProductDB {

public static Product getProduct(String productCode){
    
    Product p = null;
            
    if(productCode.equalsIgnoreCase("java")
        || productCode.equalsIgnoreCase("jsp")
        || productCode.equalsIgnoreCase("mysql")) {
    
    Book b = new Book();
    
    if(productCode.equalsIgnoreCase("java")){
        b.setCode(productCode);
        b.setDescription("Murach's Java Programming");
        b.setPrice(57.50);
        b.setAuthor("Joel Murach");
}   else if (productCode.equalsIgnoreCase("jsp")) {
        b.setCode(productCode);
        b.setDescription("Murach's Java Servlets and JSP");
        b.setPrice(57.50);
        b.setAuthor("Mike Urban");
                } else if (productCode.equalsIgnoreCase("mysqul")){
                    b.setCode(productCode);
                    b.setDescription("Murach's MySQL");
                    b.setPrice(54.50);
                    b.setAuthor("Joel Murach");
                }
    p = b;
    } else if (productCode.equalsIgnoreCase("netbeans")){
        Software s = new Software();
        s.setCode("netbeans");
        s.setDescription("Net Beans");
        s.setPrice(0.00);
        s.setVersion("8.2");
        p = s;
    } else if (productCode.equalsIgnoreCase("sgtp")){
        Album a = new Album();
        a.setCode(productCode);
        a.setDescription("Sgt. Peppers");
        a.setPrice(20.0);
        a.setArtist("The Beatles");
        p = a;
    }
    

    return p;
}
}