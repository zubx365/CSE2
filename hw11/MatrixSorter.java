//Matthew Chin
//Date: 12/5/2014
//Course Information: CSE002-110
//Homework 11, Program 2 Matrix Sorter Program
/*
This program sorts a 3D array...
The call to buildMat3d should return a ragged 3D array, where the first slab has three rows, 
the second slab five rows, and the third slab seven rows (i.e., if s denotes the slab, the number of rows in the sth slab is 3+2*s). 
Within the sth slab, the jth row should have s+j+1 columns. The ragged 3D array should be initialized with random numbers in the range 1..99, 
inclusive. The method show() should print out the array (all slabs). The method findMin() should find the smallest entry in the array. 
The method sort() should take as input a ragged 2D array. It should sort the entries in each row of the array, using a selection sort. 
Then it should sort the rows by the value in the first column of each 
row using an insertion sort. (In technical terms, we say the first entry in a row is to be used as the key for the sort).
*/

//MatrixSorter class
public class MatrixSorter {
    //main method
    public static void main(String arg[]) {

            int mat3d[][][]; //declare a 3d array called mat3d
            //initialize and allocate values for mat3d by copying all the values from the 3d array created by buildMat3d().
            mat3d = buildMat3d();
            //display the 3d array mat3d
            //    show(mat3d);
            //output message to tell user smallest entry in 3d matrix
            //    System.out.println("The smallest entry in the 3D matrix is " +
            //        findMin(mat3d)); //method searches 3d matrix for lowest entry and returns value

            //output message notifying user that the 3d matrix will be sorted, then returned by the call to show(). 
            System.out.println("After sorting the 3rd matrix we get");
            //sorts the 3d matrix per specifications above
            //    sort(mat3d[2]);
            //display the 3d matrix after it has been sorted
            //    show(mat3d);



        } //end main 

    //this method creates a 3d ragged array containing random elements from [1-99]
    public static int[][][] buildMat3d() {

            int[][][] matrix1 = new int[3][][]; //initialzes and allocates memory for 3d matrix

            matrix1[0] = new int[3][3]; //sets slab 1 to have 3 rows and 3 columns
            matrix1[1] = new int[5][6]; //sets slab 2 to have 5 rows and 6 columns
            matrix1[2] = new int[7][9]; //sets slab 3 to have 7 rows and 9 columns

            
            //prints out slab 1
            for (int i = 0; i < 2; i++) {
                for (int row = 0; row < 7; row++) { //loops through the rows in slab n

                    for (int column = 0; column < 9; column++) { //loops through the columns in slab n, row n

                        //assigns the respective slab,row,column to a random value in range of [1-99]
                        matrix1[i][row][column] = (int)((Math.random() * 99) + 1); 

                        System.out.print(matrix1[i][row][column] + " "); //test
                        
                    } //end inner for
                    System.out.println(); //test
                } //end outer for

            }//end slab for
            
            return matrix1; //returns the populated matrix
        } //end buildMat3d method

        //show method-displays the contents of the 3d matrix
        public static int[][][] show(int[][][] matrix){
            
            for(int i = 0; i <3; i++){  //loops through slabs
                for(int i = 0; i < 7; i++){    //loops through rows
                    for(int i = 0; i< 9; i++){  //loops through columns
                        
                        System.out.print(matrix[][][] + " ");   //prints out each slab/row/column
                    }//end 2nd inner loop
                    System.out.println();   //makes new line 
                }//end 1st inner for loop
            }//end outer for loop
        }//end show method
        
} //end MatrixSorter class
