package CDAC;

import java.util.Scanner;
public class TwoDarray {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int arr[][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){

                arr[i][j] = (int)(Math.random()*10); 

            }
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){

                System.out.print(+arr[i][j]+ " " ); 

            }
            System.out.println();
        }


    }
    
    
}
