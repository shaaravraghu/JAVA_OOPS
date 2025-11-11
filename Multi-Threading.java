// Multi-tasking: Multitasking means executing multiple tasks (programs/processes) apparently at the same time.
/* Types of Multi-tasking:
1. Process-based multitasking — multiple independent processes (each with its own memory).
2. Thread-based multitasking — multiple threads within one process (sharing memory).
*/
// Multi-processing: Multiprocessing means using two or more processors (CPUs or cores) to execute multiple processes simultaneously.
// Multi-threading: Multithreading means executing multiple threads (smaller units of a process) concurrently within the same process. Each thread shares the same memory but has its own stack and execution path.


// THREAD: A thread is the smallest unit of a program that can execute independently. It is often called a lightweight subprocess, since it runs inside a process but shares that process’s resources (memory, data, files, etc.) with other threads.
// MULTI-THREADING: Multithreading means executing multiple threads concurrently in a single program (process). Each thread performs a separate task, and all threads share the same memory area. 

// Why Multi-theading? Improved Performance, Efficient CPU Utilisation, Faster Execution, Resource Sharing
// Disadvantage: Complex Debugging, Synchronisation Issues, Random Ordering, Long-waiting thread execution time
// Difference between Processes and Threads

/* Thread Lifecycle:
1. New: Thread object created and not started
2. Runnable: ready to start; waiting for CPU-time
3. Running: Execution
4. Blocked/ Waiting
5. Termination
*/

// Thread Creation Method: (1) Thread class
class MyThread extends Thread {
    public void run() {
        // Code inside run() is executed by the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Thread object 1
        MyThread t2 = new MyThread(); // Thread object 2
        t1.start(); // Start thread t1
        t2.start(); // Start thread t2
        System.out.println("Main thread ends");
    }
}
// Key methods: start(), run(), getName(), setName(), getID(), isAlive(), sleep() 

// (2) Runnable Interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj, "Worker-1");
        Thread t2 = new Thread(obj, "Worker-2");
        t1.start();
        t2.start();
        System.out.println("Main thread ends");
    }
}

// Thread Methods
// start() and run()
class MyThread extends Thread {
    public void run() { // defines the code to be executed in the thread
        System.out.println("Thread running...");
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // starts new thread by calling the run method
    }
}
// sleep(ms)
Thread.sleep(1000);  // 1 second; stops thread temporarily and makes it runnable again
// join()
t1.join(); // whichever thread is currently running waits till t1 completes
// yield()
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " running " + i);
            Thread.yield(); // indicates willing to pause and allow threads of equal and higher priority to execute
        }
    }
// interrupt()
t.interrupt(); // used to interrupt a thread that’s sleeping, waiting, or blocked
// isAlive()
t.isAlive(); // checks whether a thread is currently active (running or runnable).
// getName() and setName()
t.setName("Worker-1");
System.out.println(t.getName());
// setPriority() and getPriority(): Thread.MIN_PRIORITY : 1; Thread.NORM_PRIORITY : 5 (default); Thread.MAX_PRIORITY : 1
t.setPriority(Thread.MAX_PRIORITY);
System.out.println(t.getPriority());
// currentThread()
System.out.println(Thread.currentThread()); // static method so it has to be called using Thread class


// Synchronized Method: allows only one thread using this method to run at a time
synchronized returnType methodName() {
    // critical section
}

wait(); // requests current thread to wait
notify(); // it wakes only 1 thread that is waiting at a time
notifyAll(); // it wakes up all the threads waiting at a time

