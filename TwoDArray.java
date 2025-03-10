import java.util.Scanner;
public class TwoDArray {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int arr[][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){

                arr[i][j] = scn.nextInt(); 

            }
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){

                System.out.print("Here is two D array : " +arr[i][j]+ " " ); 

            }
            System.out.println();
        }


    }
    
    
}
