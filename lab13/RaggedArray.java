import java.util.*;

public class RaggedArray {

    public static void main(String args[]) {
            int r = 5;
            int[][] rag = new int[r][];
            rag[0] = new int[(0 * 3) + 5];
            rag[1] = new int[(1 * 3) + 5];
            rag[2] = new int[(2 * 3) + 5];
            rag[3] = new int[(3 * 3) + 5];
            rag[4] = new int[(4 * 3) + 5];

            System.out.println("The array before sorting: \n");

            for (int row = 0; row < 5; row++) {

                for (int column = 0; column < rag[row].length; column++) {

                    rag[row][column] = (int)(Math.random() * 40);

                    System.out.print(rag[row][column] + " ");
                }
                System.out.println();

            }


            System.out.println("\nThe array after sorting: \n");
            
            //row 1
            int temp1 = 0
            for(int i = 0; i <= 0; i++){
                for(int j = 0; j < rag[5].length; j++){
                    
                    if(rag[0][j] > rag[0][j+1]){
                     
                     temp1 = rag[0][j];
                     rag[0][j] = 
                        
                    }
                }
            }
            
            
            //print out final sorted array
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < rag[i].length; j++) {
                    
                    System.out.print(rag[i][j] + " ");
                }

                System.out.println();
            }

        } //end main
} //end class