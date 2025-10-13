// Defining main class
public class Main {
  public static void main(String[] args) {
    //main class
  }
}


// Print statement with default \n
System.out.println("Hello World");


// Print statement
System.out.print("Hello World! ");
System.out.print("I will print on the same line.");


// Multi-line comments
/*
    this
    is 
    multi-line
*/


// Declaring variables
String var1 = "hello";
int var2;
float var3 = 3.66f;
double var4 = 7.99;
boolean var5 = true; // fale
char var6 = 'a';// any other special character or digit also
// byte, short and long(l) can also be used
// follow same rules for identifiers as Python/ C++
// data type cannot be changed during the run of the program


// Declaring constants
final int var7 = 10;


// Concatenation and declaring multiple variables
int x = 5, y = 6;
System.out.println("The sum is " + x + y);   // Prints: The sum is 56
System.out.println("The sum is " + (x + y)); // Prints: The sum is 11


// One value to multiple variables
int x, y, z;
x = y = z = 50;


// Not declaring variable type
var x = 5;



// Type Casting
/*
Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte
*/

int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double
System.out.println(myInt);    // Outputs 9
System.out.println(myDouble); // Outputs 9.0

double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int
System.out.println(myDouble); // Outputs 9.78
System.out.println(myInt);    // Outputs 9


// Operators
/*
arithmetic: + - * / % ++ --
assignment: = += -= /= *= %=
bit manipulation: << >> ^  | &
comparison: == < > <= >= !=
logical: && || !

operator precedence
() - Parentheses
*, /, % - Multiplication, Division, Modulus
+, - - Addition, Subtraction
>, <, >=, <= - Comparison
==, != - Equality
&& - Logical AND
|| - Logical OR
= - Assignment
*/


// Some in-built string functions
var1.length();
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
System.out.println(txt1.equals(txt2));
va1.trim(); trims leading and trailing whitespaces
a.concat(b).concat(c);


// Escape sequences
// \' \" \\ \n \t \r \b


// Math class in-built
Math.max(5, 10);
Math.min(5, 10);
Math.sqrt(64);
Math.abs(-4.7);
Math.pow(2, 8);
Math.round(4.6);  // closest integer
Math.ceil(4.1);   // 5.0
Math.floor(4.9);  // 4.0
Math.random();
 


// Selection statements
if (condition) {
  // block of code to be executed if the condition is true
}

if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}

if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}

variable = (condition) ? expressionTrue :  expressionFalse;

if (condition1) {
  // code to run if condition1 is true
  if (condition2) {
    // code to run if both condition1 and condition2 are true
  }
}

switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}


// Looping Statements
while (condition) {
  // code block to be executed
}

do {
  // code block to be executed
}
while (condition);

for (statement 1; statement 2; statement 3) {
  // code block to be executed
}

// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 

for (type variableName : arrayName) {
  // code block to be executed
}

break;
continue;


// Arrays
String[] cars;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4

String[] cars = new String[4]; // size is 4
cars[0] = "Volvo";
cars[1] = "BMW";
cars[2] = "Ford";
cars[3] = "Mazda";

int[] numbers = {10, 20, 30, 40};

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String car : cars) {
  System.out.println(car);
}

int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} }; 

int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
System.out.println(myNumbers[1][2]); // Outputs 8

int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };
System.out.println("Rows: " + myNumbers.length);             // 2
System.out.println("Cols in row 0: " + myNumbers[0].length); // 3
System.out.println("Cols in row 1: " + myNumbers[1].length); // 5

int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };
for (int row = 0; row < myNumbers.length; row++) {
  for (int col = 0; col < myNumbers[row].length; col++) {
    System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
  }
}