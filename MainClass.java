package CDAC;


//Overriding polymorphism and Runtime polymorphism in which...
// subclass/Child class have some specific implementation of Super class/ Parent class.


class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Reference of type Animal
        Animal myDog = new Dog();  // Reference of type Animal but object of Dog
        Animal myCat = new Cat();  // Reference of type Animal but object of Cat
        
        myAnimal.sound();  // Outputs: Some generic animal sound
        myDog.sound();  // Outputs: Bark
        myCat.sound();  // Outputs: Meow
    }
}

