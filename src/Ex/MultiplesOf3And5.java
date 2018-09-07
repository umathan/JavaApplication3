package Ex;

public class MultiplesOf3And5 {

public static void main(String[] args){
    
    int i = 0;
    int sum = 0;
    
    for (i = 0; i < 1000; i++){
        if (i %3 == 0 || i%5 == 0){
           sum = sum+i;
        }
           }
    
   System.out.println("Sum is " + sum);
}
}

