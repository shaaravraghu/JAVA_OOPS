class mythreads extends Thread {
	public void run(){
		for (int i = 0; i<5; i++){
			System.out.println("thread " + Thread.currentThread().getName() + " is running!");
		}
	}
}

class mythreadinterface implements Runnable {
	public void run(){
		for (int i = 0; i<5; i++){
			System.out.println("thread " + Thread.currentThread().getName() + " is running!");
		}
	}
}

class counting extends Thread {
	static int count = 0;

	static synchronized void counter() {
		count += 1;
	}

	public void run(){
		for (int i = 0; i<20; i++){
			System.out.println("thread " + Thread.currentThread().getName() + " is running!");
			counter();
		}
	}
}


class Multi_threading{
	public static void main (String args[]){

		/*
		mythreads t1 = new mythreads();
		mythreads t2 = new mythreads();
		mythreads t3 = new mythreads();
		t1.start();
		t2.start();
		t3.start();
		Thread t4 = new Thread(new mythreadinterface());
		Thread t5 = new Thread(new mythreadinterface());
		Thread t6 = new Thread(new mythreadinterface());
		t4.start();
		t5.start();
		t6.start();
		*/

		counting t1 = new counting();
		counting t2 = new counting();	
		t1.start();
		t2.start();

	}
}