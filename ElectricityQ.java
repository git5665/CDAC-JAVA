import java.util.Scanner;
public class ElectricityQ {
    public static void main(String arg[]){
        int a;
        //int b = 200;
        //int sum;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Electricity Unit : ");

        a = scn.nextInt();

        if(a > 0 && a <= 100){
            System.out.println("Price of first "+a+" unit is : "+(a*1));
        }
        else if(a>100 && a <=200){
            System.out.println("Price of "+a+" unit is : "+((100*1)+((a - 100)*2)));
        }
        else{
            System.out.println("Enter correct unit ");
        }
        //System.out.println("Price of total unit is : "+ ((a*1)+((b - 100)*2)));
                scn.close();
    }
}
