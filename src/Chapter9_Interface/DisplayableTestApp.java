package Chapter9_Interface;

public class DisplayableTestApp {

public static void main(String [] args){
    
    Displayable e = new Employee("John", "Jack", 3);
    display(e);
    
    Displayable p = new Product("Java", "textBook", 60.0);
    display(p);
}

private static void display(Displayable d){
    System.out.println(d.getDisplayText());
}
    
}
