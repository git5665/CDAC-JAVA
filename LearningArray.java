import java.util.Scanner;


public class LearningArray
{
   public static void main(String args[]) {
       Scanner scn = new Scanner(System.in);
       int size;
       System.out.println("Size of the array : ");
       size = scn.nextInt();
       
       System.out.println("Write the elements in the array : ");
       int numbers[] = new int[size];


       for(int i=0; i<size; i++) {
           numbers[i] = scn.nextInt();
       }


     
	//print the numbers in array
       for(int i=0; i<size; i++) {
           System.out.print(numbers[i]+" ");
       }
       scn.close();
   }
}
