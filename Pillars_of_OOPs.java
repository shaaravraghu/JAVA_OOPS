// Four Pillars of OOPS
/*
1. Encapsulation
2. Abstraction
3. Inheritence
4. Polymorphism
*/


// Encapsulation
// keeping sensitive data hidden and non-manipulative
// use of private variable to keep data hidden and non-manipulated; can only be accessed through methods
public class Person {
  private String name; // private = restricted access
  // Getter
  public String getName() {
    return name;
  }
  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
class BankAccount {
    private double balance;  // hidden data
    // public methods to access it
    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if(amount <= balance) balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

// use of private methods; accessible only within the same class (through methods only)— not from subclasses, not from other classes, not even through objects.
class ATM {
    private boolean validatePIN(int pin) {
        return pin == 1234;
    }
    public void withdraw(int pin, double amount) {
        if (validatePIN(pin)) {
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid PIN!");
        }
    }
}


// Inheritance
// allows a class to inherit fields and methods from another class
class Parent {
    void speak() { System.out.println("Parent speaking..."); }
}
class Child extends Parent {
    void play() { System.out.println("Child playing..."); }
}
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.speak();  // inherited from Parent
        c.play();   // defined in Child
    }
}
// Single A → B; Multilevel A → B → C; Hierarchical A → B, C; Multiple A, B → C (not supported by Java); Hybrid
// declaring a class as final doesn't allow inheritance


// Polymorphism
// same method behaves differently in different context
// two types: 1. Compile-time polymorphism (overloading); and 2. Run-time polymorphism (overriding)
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        Dog b = new Dog();
        a.sound();             // Dog's sound (runtime)
        b.sound();             // Dog's sound (runtime)
    }
}

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}




// Inner Class
class OuterClass {
  int x = 10;
  class InnerClass {
    int y = 5;
  }
}
public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}


// private inner class
class Bank {
    private class Locker {
        void accessLocker() {
            System.out.println("Locker accessed securely!");
        }
    }
    public void openLocker() {
        Locker locker = new Locker(); // allowed inside outer class
        locker.accessLocker();
    }
}
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.openLocker();       // ✅ works fine
        // Bank.Locker l = bank.new Locker(); // ❌ Error: Locker has private access
    }
}


// Abstraction
// doesn't allow multiple inheritances
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}
// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}
class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}


// Interfaces: Complete Abstraction (can have multiple inheritances)
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}
// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}
class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}

interface FirstInterface {
  public void myMethod(); // interface method
}
interface SecondInterface {
  public void myOtherMethod(); // interface method
}
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}
class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}


// Enumeration
enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);
    private final double mass;   // in kilograms
    private final double radius; // in meters
    // Constructor (always private)
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    double surfaceGravity() {
        final double G = 6.67300E-11; // universal gravitational constant
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}
public class EnumDemo {
    public static void main(String[] args) {
        double earthWeight = 75; // weight in kg on Earth
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values()) {
            System.out.printf("Your weight on %s is %.2f N%n",
                    p, p.surfaceWeight(mass));
        }
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
class TestEnum {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Weekend loading...");
                break;
            case SUNDAY:
                System.out.println("It's rest day!");
                break;
            default:
                System.out.println("Regular day.");
        }
    }
}


import java.util.Scanner;  // Import the Scanner class
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    String userName = myObj.nextLine();  // Read user input
    // nextBoolean(), nextFloat(), nextDouble(), nextInt(), nextByte()
  }

}
