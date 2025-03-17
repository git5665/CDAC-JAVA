package CDAC;
import java.util.Scanner;
public class StarPattern {
    
    public static void main(String arg[]) {
    	
    	Scanner scn = new Scanner(System.in);
        int row; // Set the number of rows for the pyramid
        
        System.out.println("Enter any number to print STAR PATTERN ");
        row = scn.nextInt();
        
        // Outer loop for each row
        
        for (int i = 1; i <= row; i++) {
            
            // Print spaces before stars to center the pyramid
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars in the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
