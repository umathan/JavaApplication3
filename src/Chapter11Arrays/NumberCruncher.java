package Chapter11Arrays;

import java.util.Arrays;

public class NumberCruncher {

    public static void main(String[] args){
        
        int [] numbers = new int[11];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 51);
        }
        // sort the Array
        Arrays.sort(numbers);
        // display numbers
        String numbersString = "";
        
        for(int number: numbers){
            numbersString += number + " ";
        }
        System.out.println(numbersString);
        
        // calculate total and display
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        System.out.println("Total: "  + total);
        
        // get count of numbers and display
        int count = 0;
         count = numbers.length;
        System.out.println("Count: " + count);
        
        // calculate average and display
        double average = (double) total/count;
        average = (double)Math.round(average*10)/10;
        System.out.println("Average: " + average);
        
        // median
        if(count %2 !=0){
            int medianIndex = count/2;
            int median = numbers[medianIndex];
            System.out.println("Median: " + median);
         }
        System.out.println("***************");
        int [][] rectangle = {{1,2},{3,4},{5,6}};
        for (int i = 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++)
               // System.out.print(rectangle[i][j]);
                System.out.print(rectangle[i][j] + " ");
            System.out.println("\n");
        }
        
    } 
}
