package CDAC;




//Encapsulation Example
class Person {
 private String name; // Private variable (data hiding)

 // Getter method to access private variable
 public String getName() {
     return name;
 }

 // Setter method to modify private variable
 public void setName(String newName) {
     this.name = newName;
 }
}

public class EncapsulationExample {
 public static void main(String[] args) {
     Person p = new Person();
     p.setName("John Doe"); // Setting the name
     System.out.println(p.getName()); // Getting the name
 }
}

