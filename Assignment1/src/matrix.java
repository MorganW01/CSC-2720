import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// MORGAN WARREN
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
                matrix1[i][j] = random.nextInt(51);
            }
        }

        //double for loop that fills matrix2
        for (int k =0; k<dimensions; k++){
            for (int l =0; l<dimensions; l++) {
                matrix2[k][l] = random.nextInt(51);
            }
        }

        System.out.println("Matrix 1 is as follows:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (j==0){
                    System.out.print("[");
                    if (i==0){
                        System.out.print("[");
                    }
                }
                System.out.print(matrix1[i][j] + ", ");

                if (j==49){
                    System.out.print("]");
                    if (i==49){
                        System.out.print("]");
                    }
                }

            }
            System.out.println();
        }

        System.out.println(); // separates the matrices

        System.out.println("Matrix 2 is as follows:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (j==0){
                    System.out.print("[");
                    if (i==0){
                        System.out.print("[");
                    }
                }
                System.out.print(matrix2[i][j] + ", ");

                if (j==49){
                    System.out.print("]");
                    if (i==49){
                        System.out.print("]");
                    }
                }

            }
            System.out.println();
        }


        //created an empty matrix to later store with the products of the values from matrix1 and matrix2
        int [][] productMatrix = new int[dimensions][dimensions];

        System.out.println("Result matrix is as follows:");
        for(int i=0;i < dimensions;i++){ //rows in matrix1

            for(int j=0;j < dimensions;j++){// columns in matrix2

                productMatrix[i][j]= 0;

                for(int k = 0; k < dimensions; k++) { //columns in matrix1

                    productMatrix[i][j]+= matrix1[i][k]*matrix2[k][j];
                }

                System.out.print(productMatrix[i][j]+ " ");  //printing matrix element
            }
            System.out.println();
        }
        System.out.println();

        long beginningTime = System.currentTimeMillis();
        long timeElapsed = System.currentTimeMillis() - beginningTime;
        System.out.println("Total execution time is: " + timeElapsed + "ms");

        // insert a timer
        //ask the user if they want to play again.
        }

    }




