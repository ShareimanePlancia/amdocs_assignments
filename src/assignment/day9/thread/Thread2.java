package assignment.day9.thread;

public class Thread2 extends Thread{
    private final String name; 
    
    Thread2(String name) {
        this.name = name;
    }
    
	@Override
	public void run() {
		for(int i = 5; i>0; i--) {
			System.out.println("[" + name + "] => " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finished [" + name + "]");
	}

}
