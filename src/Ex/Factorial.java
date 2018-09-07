package Ex;

public class Factorial {
    
    public static void main (String [] args){
        
        System.out.println("Factorial is: " + factorial(4));
        
            
    }
    
    public static int factorial(int num){
       
        
        int factorial = 1;
        for (int i = 1; i <= num; i++){
             factorial = factorial * i;
        }
        return factorial;
    }
    
}
