package CDAC;

//Method Overloading and compile time polymorphism have same method name but have different parameters
class Printer {
    // Overloaded method to print integer
    void print(int num) {
        System.out.println("Printing number: " + num);
    }
    
    // Overloaded method to print string
    void print(String str) {
        System.out.println("Printing string: " + str);
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);  // Calls the method that takes an int
        p.print("Hello, Java!");  // Calls the method that takes a String
    }
}
