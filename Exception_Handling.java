// Classification of Errors
/*
1. Based on when they occur
1.1 Compile-time errors
1.2 Run-time errors
2. Based on Throwable Hierarchy
2.1 Error
2.2 Exception
2.2.1 Checked
2.2.2 Unchecked
*/


// try block
try {
    // code that may cause an exception
}


// catch and multiple catch block
catch (ExceptionType e) {
    // code to handle the exception
}

try {
    int[] arr = new int[3];
    arr[5] = 50; // ArrayIndexOutOfBoundsException
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic error!");
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error!");
}
catch (Exception e) {
    System.out.println("General exception: " + e);
}


// finally block
try {
    int data = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Caught: " + e);
} finally {
    System.out.println("Finally block executed!");
}


// throw exception
throw new ExceptionType("error message");


// throws and exception class
class MultiThrowsExample {
    void riskyMethod() throws IOException, ArithmeticException {
        // may throw IOException
        if (Math.random() > 0.5)
            throw new IOException("IO problem!");
        else
            throw new ArithmeticException("Math problem!");
    }
    public static void main(String[] args) {
        MultiThrowsExample obj = new MultiThrowsExample();
        try {
            obj.riskyMethod();
        } catch (IOException | ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}