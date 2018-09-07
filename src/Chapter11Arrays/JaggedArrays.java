package Chapter11Arrays;

public class JaggedArrays {

    public static void main (String [] args){
        
        int number = 0;
        int [][] pyramid = new int [4][];
        for (int i = 0; i < pyramid.length; i++){
            pyramid[i] = new int[i+1];
            for (int j = 0; j < pyramid[i].length; j++){
                pyramid[i][j] = number++;
        }
        
    }

    for (int[] row:pyramid){
        for (int col: row)
            System.out.print(col + " ");
            System.out.println("\n");
    }
}
}
