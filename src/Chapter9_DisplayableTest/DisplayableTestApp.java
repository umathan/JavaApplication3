package Chapter9_DisplayableTest;

public class DisplayableTestApp {
    
    public static void main (String[] args){
        
        System.out.println("Welcome to the displayable systems app \n");
        
        Displayable e = new Employee(2, "Smith", "JOnes");
        display(e);
        
        Displayable p = new Product("java", "Murach's Java Programming", 57.50);
        display(p);
        
        System.out.println();
    }
    
    private static void display(Displayable d){
        System.out.println(d.getDisplayText());
    }
    
    
}
