import java.util.Scanner;
import java.util.Random;

public class matrix {

    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        int row =0;
        int column=0;
        System.out.println("Enter the first dimension of the matrix:");
        row = scanner.nextInt();
        System.out.println("Enter the second dimension of the matrix:");
        column = scanner.nextInt();

        if (row*column!=50){
            do {
                System.out.println("Your dimensions need to equal 50. Please enter new values.");
                System.out.println("Enter the first dimension of the matrix:");
                row = scanner.nextInt();
                System.out.println("Enter the second dimension of the matrix:");
                column = scanner.nextInt();

            } while (row * column != 50);

        }

        //placeholder
        System.out.println(row*column);
        // create two arrays of size row and column and then fill the arrays with random integer values ranging from 0 to 50.
        
        // Then use matrix multiplication to find the product
        // insert a timer
        //ask the user if they want to play again.





    }


}
