import java.util.Scanner;
import java.util.Random;

public class matrix {

    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int dimensions = 0;
        System.out.println("Enter the dimensions of the matrix:"); //should be 50
        dimensions = scanner.nextInt();


        if (dimensions!=50){
            do {
                System.out.println("Your dimensions need to equal 50. Please enter a new value.");
                System.out.println("Enter the dimensions of the matrix:");
                dimensions = scanner.nextInt();

            } while (dimensions != 50);

        }


        // create two arrays of size dimensions (50x50) and then fill the arrays with random integer values ranging from 0 to 50.
        int [][] matrix1 = new int [dimensions][dimensions];
        int [][] matrix2 = new int[dimensions][dimensions];

        //double for loop that fills matrix1
        for (int i =0; i<dimensions; i++){
            for (int j =0; j<dimensions; j++) {
                //i = random.nextInt(51);
                //j = random.nextInt(51);
                matrix1[i][j] = random.nextInt(51);
            }
        }

        //double for loop that fills matrix2
        for (int k =0; k<dimensions; k++){
            for (int l =0; l<dimensions; l++) {
                //k = random.nextInt(51);
                //l = random.nextInt(51);
                matrix2[k][l] = random.nextInt(51);
            }
        }


        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }




        // Then use matrix multiplication to find the product
        // insert a timer
        //ask the user if they want to play again.





    }


}
