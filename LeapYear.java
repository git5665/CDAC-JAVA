import java.util.Scanner;
public class LeapYear {
    public static void main(String arg[]){

        int a;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a year : ");
        a = scn.nextInt();

        if(a % 4 == 0){
            if(a % 100 == 0){
                if(a % 400 == 0){
                    System.out.println("Leap Year : "+ a);
                }
            }
        }
        else {
            System.out.println("is not a Leap Year : ");
    
        }
        scn.close();

    }
    
}
