// Creating a method
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }
  public static void main(String[] args) {
    myMethod();
  }
}
// Outputs "I just got executed!"


// Adding parameters to a method
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }
  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}
// Liam is 5
// Jenny is 8
// Anja is 31


// Using return
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 (5 + 3)



// Method Overloading
// also called compile-time polymorphism
// Overloading → same class, compile-time
// Overriding → different classes (inheritance), runtime
// The difference must be in number, type, or order of parameters.
// compiler always prefers perfect match

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));         // calls int add(int, int)
        System.out.println(c.add(2.5, 3.5));     // calls double add(double, double)
        System.out.println(c.add(2, 3, 4));      // calls int add(int, int, int)
    }
}

// Type-casting to larger datatype
class Demo {
    void show(int a) {
        System.out.println("int method");
    }
    void show(double a) {
        System.out.println("double method");
    }
}
class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(5);      // int method
        d.show(5.5);    // double method
        d.show('A');    // int method (char → int)
        d.show(5L);     // double method (long → double)
    }
}

class Varargs {
    void display(int... a) { System.out.println("Varargs method"); }
    void display(int a) { System.out.println("Normal method"); }
    public static void main(String[] args) {
        Varargs v = new Varargs();
        v.display();     // Varargs
        v.display(5);    // Normal
        v.display(1,2);  // Varargs
    }
}


// Recursion
public class Main {
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
}


// Creating objects (multiple)
public class Main {
  int x = 5;
  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}


//using multiple classes
public class Main {
  int x = 5;
}
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}


// class attributes refer to variables
// overriding attributes using objects
public class Main {
  int x = 5;
  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}


// Access Control Modifiers
/*
public: 
accessibility everywhere
applies to class, method, variable, constructor, interface
protected:
accessibility in same package and subclasses (even if in different packages)
applies to method, variable, constructor
default: also called package private
accessibility within same package
applies to class, method, variable, constructor
private:
accessibility within same class
applies to method, variable, constructor
*/

// Non-Access Control Modifiers
/*
static:
applies to variable, method, block, nested class
defining static makes the variable, method, block, nested class be shared equally in the class without creating instances for objects and static methods can be directly called without creating objects
final:
applies to variable, class, method
Variable → constant; Method → cannot override; Class → cannot be inherited
abstract:
applies to class, method
defines incomplete class/method that must be implemented by subclass.
*/


// Constructors: similar to default argument in methods but defined for the class
// Create a Main class
public class Main {
  int x;  // Create a class attribute
  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }
  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}
// Outputs 5

public class Main {
  int modelYear;
  String modelName;
  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }
  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
// Outputs 1969 Mustang


// this keyword: refers to current object in method/ constructor; often used to reduce confusion when attributes have the same name as method/ constructor arguments
public class Main {
  int x;  // Class variable x
  // Constructor with one parameter x
  public Main(int x) {
    this.x = x; // refers to the class variable x
  }
  public static void main(String[] args) {
    // Create an object of Main and pass the value 5 to the constructor
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}


public class Main {
  int modelYear;
  String modelName;
  // Constructor with one parameter
  public Main(String modelName) {
    // Call the two-parameter constructor to reuse code and set a default year    
    this(2020, modelName);
  }
  // Constructor with two parameters
  public Main(int modelYear, String modelName) {
    // Use 'this' to assign values to the class variables
    this.modelYear = modelYear;
    this.modelName = modelName;
  }
  // Method to print car information
  public void printInfo() {
    System.out.println(modelYear + " " + modelName);
  }
  public static void main(String[] args) {
    // Create a car with only model name (uses default year)
    Main car1 = new Main("Corvette");
    // Create a car with both model year and name
    Main car2 = new Main(1969, "Mustang");
    car1.printInfo();
    car2.printInfo();
  }
}
// Outputs: 
// 2020 Corvette
// 1969 Mustang