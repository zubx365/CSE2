//DONE
//
//*****************
import java.util.Scanner;

public class Arrays {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("enter 10 integers.");

        for (int i = 0; i < array.length; i++) {

            System.out.print("Enter an int: ");

            int input = scan.nextInt();

            array[i] = input;

        } //end for

        int max = array[0];

        for (int k = 0; k < array.length; k++) {

            if (max < array[k]) {
                int temp = array[k];
                max = temp;
            }

        }
        System.out.println("The highest entry is: " + max);

        int min = array[0];

        for (int j = 0; j < array.length; j++) {

            if (min > array[j]) {
                int temp = array[j];
                min = temp;
            }
        }

        System.out.println("The lowest entry is: " + min);

        int sum = 0;
        int temp = 0;

        for (int l = 0; l < array.length; l++) {


            temp += array[l];

        }
        sum = temp;
        System.out.println("The sum is: " + sum);

        int[] array2 = new int[array.length];

        for (int q = 0, e = 9; q < array.length; q++, e--) {

            array2[q] = array[e];
        }

        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a] + "     " + array2[a]);
        }
    }
}