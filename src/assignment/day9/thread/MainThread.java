package assignment.day9.thread;

public class MainThread {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1("Thread # 1");
		Thread1 thread2 = new Thread1("Thread # 2");
		Thread2 thread3 = new Thread2("Thread # 3");
		Thread2 thread4 = new Thread2("Thread # 4");
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(2);
		thread3.setPriority(Thread.NORM_PRIORITY);
		thread4.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
		
	}
}


