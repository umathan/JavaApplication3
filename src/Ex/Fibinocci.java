package Ex;

public class Fibinocci {

public static void main(String[] args){
    
    int i = 0;
    int j = 1;
    int k = i + j;
    int sum = 0;
    
    while(k<4000000){
    
        i = j;
        j = k;
        k = i+j;
        if(k%2 == 0){
        sum += k;
        }
        
    
    }
    System.out.println(sum);
}
}
