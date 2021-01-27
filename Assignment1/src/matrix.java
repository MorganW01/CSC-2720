import java.util.Scanner;
import java.util.Random;

//NAME: MORGAN WARREN
public class matrix {

    public static void main(String[] args) {
        //boolean to check if the user wants to continue the program
        boolean continueMatrix = false;
        do {
            //long used to track how long the program takes to run. Starts at the beginning of the program.
            long beginningTime = System.currentTimeMillis();
            //scanner Object used to obtain user input
            Scanner scanner = new Scanner(System.in);
            //Random object used to generate random numbers for the matrix
            Random random = new Random();
            //dimensions variable for row x columns dimensions of matrix
            int dimensions = 0;
            System.out.println("Enter the dimensions of the matrix:"); //user should enter 50.
            //next value will be checked for dimensions
            dimensions = scanner.nextInt();

            //checks if user entered correct dimensions and asks them to enter the correct value
            if (dimensions != 50) {
                do {
                    System.out.println("Your dimensions need to equal 50. Please enter the correct value.");
                    System.out.println("Enter the dimensions of the matrix:");
                    dimensions = scanner.nextInt();

                } while (dimensions != 50); //do-while loop for user input

            }


            // creates two arrays of size "dimensions" (50x50)
            int[][] matrix1 = new int[dimensions][dimensions];
            int[][] matrix2 = new int[dimensions][dimensions];

            //double for loop that fills matrix1 with random integers
            for (int i = 0; i < dimensions; i++) {
                for (int j = 0; j < dimensions; j++) {
                    matrix1[i][j] = random.nextInt(51); // fills matrix with random ints ranging from 0-50.
                }
            }

            //double for loop that fills matrix2 with random integers
            for (int k = 0; k < dimensions; k++) {
                for (int l = 0; l < dimensions; l++) {
                    matrix2[k][l] = random.nextInt(51); // fills matrix with random ints ranging from 0-50.
                }
            }

            // double for loop with if statements that correctly prints out the first matrix
            System.out.println("Matrix 1 is as follows:");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    if (j == 0) {
                        System.out.print("["); //prints the opening brackets
                        if (i == 0) {
                            System.out.print("["); //prints the opening brackets
                        }
                    }
                    System.out.print(matrix1[i][j] + ", "); //prints the random numbers in the matrix

                    if (j == 49) {
                        System.out.print("]"); //prints the closing brackets
                        if (i == 49) {
                            System.out.print("]"); //prints the closing brackets
                        }
                    }

                }
                System.out.println(); //starts a new row before looping again
            }

            // separates matrix 1 from matrix 2
            System.out.println();

            System.out.println("Matrix 2 is as follows:");
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    if (j == 0) {
                        System.out.print("["); //prints the opening brackets
                        if (i == 0) {
                            System.out.print("["); //prints the opening brackets
                        }
                    }
                    System.out.print(matrix2[i][j] + ", "); //prints the random numbers in the matrix

                    if (j == 49) {
                        System.out.print("]"); //prints the closing brackets
                        if (i == 49) {
                            System.out.print("]"); //prints the closing brackets
                        }
                    }

                }
                System.out.println(); //starts a new row before looping again
            }

            //separates matrix 2 from the product matrix
            System.out.println();

            //creates an empty matrix to later store with the products of the values from matrix1 and matrix2
            int[][] productMatrix = new int[dimensions][dimensions];

            System.out.println("Result matrix is as follows:");
            for (int i = 0; i < dimensions; i++) { //rows in matrix1
                for (int j = 0; j < dimensions; j++) {// columns in matrix2
                    if (j == 0) {
                        System.out.print("["); //prints opening brackets
                        if (i == 0) {
                            System.out.print("["); // prints opening brackets
                        }
                    }
                    productMatrix[i][j] = 0;
                    for (int k = 0; k < dimensions; k++) { //columns in matrix1
                        productMatrix[i][j] += matrix1[i][k] * matrix2[k][j]; //assigns product to productMatrix spot.
                    }
                    System.out.print(productMatrix[i][j] + ", "); // prints the productMatrix element

                    if (j == 49) {
                        System.out.print("]"); //prints the closing bracket
                        if (i == 49) {
                            System.out.print("]"); //prints the closing bracket
                        }
                    }
                }
                System.out.println(); //starts a new row before looping again

            }

            //separates productMatrix from timer
            System.out.println();

           //calculates the time elapsed by subtracting current time from time tracked at the beginning.
            long timeElapsed = (System.currentTimeMillis() - beginningTime) / 1000;
            //prints total execution time in ______.
            System.out.println("Total execution time is: " + timeElapsed + "ms");

            //asks the user if they would like to continue.
            System.out.println("Would you like to continue? Enter \"yes\" or \"no.\"");
            //scanner checks for input
            String input = scanner.next();
            if (input.equalsIgnoreCase("yes")) {
                continueMatrix = true; // if yes, continue
            } else {
                continueMatrix = false;
                System.out.println("Goodbye!"); // if no, close the scanner and goodbye.
                scanner.close();
            }

        } while (continueMatrix); //end of do while loop

    } //end of main method

} //end of class




